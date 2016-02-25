package Lesson10.Containers;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.regex.Matcher;

public class Demo {
    public static void main(String[] args) {
        FirstService service = new FirstService();
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