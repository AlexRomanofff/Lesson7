package Lesson10.Reflections;

import Lesson10.Nissan;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class DemoF3 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {

      Frame3<TV> f3 = new Frame3();
        Map<String, Object> map = new HashMap<>();
        map.put("brand", "Panasonic");
//        map.put("height", 200);
//        map.put("weight", 100);
        TV tv = f3.initClass(TV.class, map);

        System.out.println(tv.getWeight());
        System.out.println(tv.getHeight());
        System.out.println(tv.getBrand());

    }

}
