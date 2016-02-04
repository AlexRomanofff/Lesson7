package lesson11;


import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteLearning {

    public void printStreamData (ByteArrayInputStream stream) throws IOException {
        int i;

        while ((i=stream.read())!=-1) {
            System.out.print(i+","+" ");
        }
        stream.close();
    }
}
