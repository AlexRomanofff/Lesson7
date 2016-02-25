package Lesson10.Reflections.Frame5;


import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) throws Exception {

       InitFields<TV> initFields = new InitFields<>();
        Map<String, Object> map = new HashMap<>();
        map.put("width", 100);
        map.put("brand", "Panasonic");

        TV tv = new TV();
        initFields.setPrivates(tv, map);

        System.out.println(tv.getWidth());
        System.out.println(tv.getHeight());
        System.out.println(tv.getBrand());

    }
}
