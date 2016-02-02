package lesson11;


import java.io.ByteArrayInputStream;

public class ByteLearning {

    public void printStreamData (ByteArrayInputStream stream) {
        int i;
        while ((i=stream.read())!=-1) {
            System.out.print(i+","+" ");
        }
    }
}
