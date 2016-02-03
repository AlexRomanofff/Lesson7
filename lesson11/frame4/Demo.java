package lesson11.frame4;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Demo {

    public static void main(String[] args) throws IOException {
        String path = "D:"+ File.separator+"new_Directory"+File.separator+"newFileCopy.txt";

        File f = new File(path);
        PrintStream ps =new PrintStream();
        InputStream fis = new FileInputStream(f);
        ps.printStreamData(fis);
    }
}
