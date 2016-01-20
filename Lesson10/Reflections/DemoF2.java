package Lesson10.Reflections;


import Lesson10.Nissan;

public class DemoF2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Frame2.printClassInfo(Nissan.class);
        System.out.println();
        Frame2.printClassMethodClass(Nissan.class);
        System.out.println();
        Frame2.printClassFields(Nissan.class);
    }
    }
