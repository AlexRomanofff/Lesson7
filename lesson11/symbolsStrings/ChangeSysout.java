package lesson11.symbolsStrings;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ChangeSysout {

    public static void main(String[] args) throws Exception{
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("D:"+ File.separator+"new_Directory"+File.separator+"newFile.txt")),true));
        System.out.println("hello my friend");
        System.out.println(123);

    }
}
