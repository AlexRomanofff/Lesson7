package lesson11;


import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {
        byte [] bytes = {4,15,77,22};
        ByteArrayInputStream stream = new ByteArrayInputStream(bytes);
        new ByteLearning().printStreamData(stream);
    }
}
