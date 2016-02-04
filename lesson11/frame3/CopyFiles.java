package lesson11.frame3;

import java.io.*;

public class CopyFiles {



    public void copyFile (File file) throws IOException {

        FileInputStream reader = new FileInputStream(file);
        BufferedInputStream bif = new BufferedInputStream(reader, 256);

        String path = file.getAbsolutePath();
        String newPath=path.substring(0,path.indexOf("."))+"Copy"+path.substring(path.indexOf("."));

        File f = new File(newPath);
        f.createNewFile();

        FileWriter fr  = new FileWriter(newPath);
        BufferedWriter br = new BufferedWriter(fr,256);
        StringBuilder builder = new StringBuilder();

        while (bif.available()>0) {
           builder.append((char)bif.read());
        }
        String data = builder.toString();

        br.write(data);
        br.flush();
        br.close();
        reader.close();
        }



}
