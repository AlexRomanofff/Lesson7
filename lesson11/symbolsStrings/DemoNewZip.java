package lesson11.symbolsStrings;


import java.io.File;

public class DemoNewZip {
    public static void main(String[] args) {
        NewZip newZip = new NewZip();
        newZip.createZip("D:"+ File.separator+"new_Directory"+File.separator+"newFile.txt");
        newZip.createZip("D:"+ File.separator+"new_Directory");
        String filePath = "D:"+File.separator+"new_Directory"+File.separator+"newFile.zip";

        newZip.extractFiles(filePath);

    }
}
