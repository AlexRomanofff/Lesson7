package Lesson10.Reflections;

import Lesson10.Nissan;

public class Demo {

    public static void main(String[] args) {
        Frame2.printClassInfo(Nissan.class);
        System.out.println();
        Frame2.printClassMethodClass(Nissan.class);
        System.out.println();
        Frame2.printClassFields(Nissan.class);

    }

}
