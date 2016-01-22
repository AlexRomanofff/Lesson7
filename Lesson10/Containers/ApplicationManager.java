package Lesson10.Containers;

public class ApplicationManager {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException{
        ApplicationManager am = new ApplicationManager();
        am.runService(FirstService.class);
        am.runService(Integer.class);
    }

    public void runService (Class aClass) throws InstantiationException, IllegalAccessException {

        if (aClass.isAnnotationPresent(RunService.class)) {
            System.out.println("Run all methods class: "+ aClass.getSimpleName());
        }
    }
}
