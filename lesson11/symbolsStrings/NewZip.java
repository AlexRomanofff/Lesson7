package lesson11.symbolsStrings;


import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class NewZip {

    public void createZip (String path) {
        File f = new File(path);
        if (f.isDirectory()) {
            createZipFolder(path);
        }else {
            createZipFile(path);
        }
    }


    private void createZipFile (String path) {
        String newPath = path.substring(0,path.indexOf("."));
        try {
            FileInputStream fin = new FileInputStream(path);
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(newPath+".zip"));

            out.putNextEntry(new ZipEntry((new File(path)).getName()));

            byte [] b = new byte[1024];
            int i;
            while ((i=fin.read(b))!=-1) {
                out.write(b, 0, i);
            }
            out.close();
            fin.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private void createZipFolder (String path) {
        try
        {
            BufferedInputStream bif = null;
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(path+".zip"));
            byte [] b = new byte[2048];

            File subDir = new File(path);
            String [] subDirList= subDir.list();
            for (String str:subDirList) {
                File f = new File(path+File.separator+str);

                FileInputStream fis = new FileInputStream(f);
                bif = new BufferedInputStream(fis, 2048);
                ZipEntry zipEntry = new ZipEntry(str);

                out.putNextEntry(zipEntry);
                int count;
                while ((count = bif.read(b, 0, 2048)) != -1) {
                    out.write(b, 0, count);
                    out.flush();
                }
            }
            bif.close();
            out.close();
        }

        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void extractFiles (String filePath) {
        FileInputStream fis;
        ZipInputStream zipIs;
        ZipEntry zEntry;

        File file = new File(filePath);
        String namePath = file.getAbsolutePath().substring(0,file.getAbsolutePath().indexOf("."));
        System.out.println(namePath);

        try

        {
            File directory = new File (namePath);
            directory.mkdir();
            directory.createNewFile();

            fis = new FileInputStream(filePath);
            zipIs = new ZipInputStream(new BufferedInputStream(fis));
            while ((zEntry = zipIs.getNextEntry()) != null) {
                try {
                    byte[] tmp = new byte[8192];

                    String opFilePath =  directory.getAbsolutePath()+File.separator+ zEntry.getName();
                    System.out.println("Extracting file to " + opFilePath);
                    FileOutputStream fos = new FileOutputStream(opFilePath);
                    int size;
                    while ((size = zipIs.read(tmp)) != -1) {
                        fos.write(tmp, 0, size);
                    }
                    fos.flush();
                    fos.close();
                } catch (Exception ex) {

                }
            }
            zipIs.close();
        } catch (FileNotFoundException e)

        {
            e.printStackTrace();
        } catch (IOException e)

        {
            e.printStackTrace();
        }
    }

}
