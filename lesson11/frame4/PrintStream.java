package lesson11.frame4;

import java.io.IOException;
import java.io.InputStream;

public class PrintStream {

    public void printStreamData (InputStream stream) throws IOException{

        StringBuilder builder = new StringBuilder();
        int i;
        while ((i=stream.read())!=-1) {
            builder.append((char)i);
        }
        System.out.println(builder);
    }
}
