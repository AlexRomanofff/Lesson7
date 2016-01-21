package Lesson10.Reflections.frame4;

import java.lang.reflect.InvocationTargetException;
import java.util.List;


public class InitConstruktor <T>{

    public T initClass (Class<T> clas, List<Object> params) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException{
        T obj;

        Class[] classes = new Class[params.size()];
        String [] nameClass =new String[params.size()];

         for(int i=0; i< nameClass.length; i++) {

             classes[i] = params.get(i).getClass();
             if (classes[i].getSimpleName().equals("Integer")) {
                 classes[i]=Integer.TYPE;

             }
         }

        obj = clas.getConstructor(classes).newInstance(params.toArray());

        return obj;
    }
}

