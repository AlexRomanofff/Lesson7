package Lesson10.Containers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ApplicationManager {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException{
        ApplicationManager am = new ApplicationManager();
        am.runService(FirstService.class);
        am.runService(Integer.class);
    }

    public <T> void runService (Class <T> aClass) throws InstantiationException, IllegalAccessException,InvocationTargetException {

        if (aClass.isAnnotationPresent(RunService.class)) {
           System.out.println("Create new instance class: "+ aClass.getSimpleName());
           T newInst = aClass.newInstance();
           for (Method m : aClass.getMethods()) {
               if (m.isAnnotationPresent(InitService.class)) {
                   m.invoke(newInst);
               }
           }

        }
    }
}
