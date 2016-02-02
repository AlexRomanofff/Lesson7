package lesson11.frame3;

import java.io.File;
import java.io.IOException;


public class Demo {

    public static void main(String[] args) throws IOException {
        CopyFiles cf = new CopyFiles();

        File file = new File("D:"+File.separator+"new_Directory"+File.separator+"newFile.txt");
        cf.copyFile(file);
    }

}
