package lesson11.frame4;

import java.io.IOException;
import java.io.InputStream;

public class PrintStream {

    public void printStreamData (InputStream stream) throws IOException{

        StringBuilder builder = new StringBuilder();

        while (stream.available()>0) {
            builder.append((char)stream.read());
        }
        System.out.println(builder);
        stream.close();
    }
}
