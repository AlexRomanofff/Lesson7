package Lesson10.Reflections.Frame5;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class InitFields<T> {

        public void setPrivates(Object obj, Map<String,Object> map) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {

            for (Map.Entry< String, Object> e : map.entrySet()) {
                Field f = obj.getClass().getDeclaredField(e.getKey());
                Field []fields = obj.getClass().getDeclaredFields();
                for (Field fi: fields) {
                    System.out.println(fi.getName());
                }

                       f.setAccessible(true);
                       f.set(obj, e.getValue());
                       f.setAccessible(false);



            }


        }
}
