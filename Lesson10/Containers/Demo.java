package Lesson10.Containers;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) {
        Service service = new FirstService();
        checkAnnotation(service);
    }

    public static void checkAnnotation(Object o) {
        for (Method m : o.getClass().getMethods()) {
            for (Annotation a : m.getAnnotations()) {
                if (a instanceof RunService) {
                    System.out.println(o.getClass().getSimpleName() + " is Running");
                }
            }
        }
    }
}