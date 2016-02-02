package lesson11;


import java.io.ByteArrayInputStream;

public class Demo {

    public static void main(String[] args) {
        byte [] bytes = {4,15,77,22};
        ByteArrayInputStream stream = new ByteArrayInputStream(bytes);
        new ByteLearning().printStreamData(stream);
    }
}
