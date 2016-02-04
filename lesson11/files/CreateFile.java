package lesson11.files;

import java.io.File;

import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException{

        String path = "D:"+File.separator+"new_Directory"+File.separator+"newFile.txt";

        File f = new File(path);
        f.getParentFile().mkdirs();
        f.createNewFile();

        System.out.println(System.getProperty("user.dir"));

    }
}
