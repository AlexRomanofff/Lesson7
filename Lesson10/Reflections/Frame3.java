package Lesson10.Reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;


public class Frame3<T> {

    public T  initClass(Class<T> clas, Map<String,Object> map) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        T o = clas.newInstance();
        Field [] fields = clas.getDeclaredFields();
        for (Field f : fields) {
            Object  fieldValue = map.get(f.getName());
            f.setAccessible(true);
            f.set(o, fieldValue);
            f.setAccessible(false);
        }

        return o;
    }

}
