package lesson11.frame3;

import java.io.*;

public class CopyFiles {



    public void copyFile (File file) throws IOException {

        FileInputStream reader = new FileInputStream(file);
        String path = file.getAbsolutePath();

        String newPath=path.substring(0,path.indexOf("."))+"Copy"+path.substring(path.indexOf("."));

        File f = new File(newPath);
        f.createNewFile();

        FileWriter fr  = new FileWriter(newPath,true);
        StringBuilder builder = new StringBuilder();
        BufferedWriter br = new BufferedWriter(fr);

        int i;
        while ((i=reader.read())!=-1){
           builder.append((char)i);
        }
        String data = builder.toString();

        br.write(data);
        br.close();

        }



}
