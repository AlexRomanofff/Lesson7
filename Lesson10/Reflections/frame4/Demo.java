package Lesson10.Reflections.frame4;


import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args)  throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        InitConstruktor<TV> init = new InitConstruktor();

        List<Object> params = new ArrayList<>();
        params.add(100);
        params.add("Sony");
        params.add(200);
        params.add(1000.0);


        TV tv = init.initClass(TV.class,params);
        System.out.println(tv.getHeight());
        System.out.println(tv.getWeight());
        System.out.println(tv.getManufacturer());
        System.out.println(tv.getPrice());

    }
}
