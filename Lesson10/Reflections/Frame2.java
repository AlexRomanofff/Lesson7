package Lesson10.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Frame2 {

    public static  void printClassInfo (Class clas) {
        while (!(clas==null)) {

            System.out.println(clas.toString());
            System.out.println(clas.getSimpleName());
            System.out.println(clas.getCanonicalName());

            clas = clas.getSuperclass();

        }
    }
    public static void printClassMethodClass (Class<?> clas) {
        Constructor[]constructors = clas.getConstructors();
        Method[]methods = clas.getMethods();
       for(Method m:methods) {
           System.out.println(m.toString());
       }
        for(Constructor c: constructors) {
            System.out.println(c.toString());

        }
    }
    public static void printClassFields(Class clas) {
        while(!(clas==null)) {
            Field[] fields = clas.getDeclaredFields();
            for (Field f: fields) {
                System.out.println(f.toString());
            }
            clas = clas.getSuperclass();
        }


    }
}
