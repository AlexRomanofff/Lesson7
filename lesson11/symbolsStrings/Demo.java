package lesson11.symbolsStrings;


import java.io.File;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {

        ChangeEncoding changeEncoding = new ChangeEncoding();
        File file = new File("D:"+File.separator+"new_Directory"+File.separator+"newFile.txt");
        changeEncoding.changeEncoding(file,"UTF-8", "ASCII");

    }
}
