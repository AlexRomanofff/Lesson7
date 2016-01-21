package Lesson10.Reflections.frame4;

import java.lang.reflect.InvocationTargetException;
import java.util.List;


public class InitConstruktor <T>{

    public T initClass (Class<T> clas, List<Object> params) throws InstantiationException, IllegalAccessException, InvocationTargetException,
             NoSuchMethodException{
        T obj;

        Class[] classes = new Class[params.size()];

         for(int i=0; i< classes.length; i++) {

             classes[i] = params.get(i).getClass();

             if (classes[i].getSimpleName().equals("Integer")) {
                 classes[i]=Integer.TYPE;

             } else if (classes[i].getSimpleName().equals("Long")) {
                 classes[i] = Long.TYPE;

             } else if (classes[i].getSimpleName().equals("Double")) {
                 classes[i] = Double.TYPE;
             }
         }
        obj = clas.getConstructor(classes).newInstance(params.toArray());

        return obj;
    }
}

