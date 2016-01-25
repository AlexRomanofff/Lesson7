package Lesson10.Containers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ApplicationManager <T> {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException{
        ApplicationManager am = new ApplicationManager();
//        am.runService(FirstService.class);
//        am.runService(Integer.class);
        am.getService(FirstService.class);
        am.getService(Integer.class);
    }

    public <T> void runService (Class <T> aClass) throws InstantiationException, IllegalAccessException,InvocationTargetException {

        if (aClass.isAnnotationPresent(RunService.class)) {
            System.out.println("Create new instance class: " + aClass.getSimpleName());
            T newInst = aClass.newInstance();
            for (Method m : aClass.getMethods()) {
                if (m.isAnnotationPresent(InitService.class)) {
                    m.invoke(newInst);
                }
            }
        }
    }
    public T getService (Class<T> aClass) throws IllegalAccessException, InstantiationException {
        if (aClass.isAnnotationPresent(RunService.class)) {
            System.out.println("Create new instance class: " + aClass.getSimpleName());
            return aClass.newInstance();
        } else {
            System.out.println(aClass.getSimpleName()+" isn't a Service");
            return null;
        }
    }
}
