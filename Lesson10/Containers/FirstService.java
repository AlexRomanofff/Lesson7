package Lesson10.Containers;

@RunService
public class FirstService {

    @InitService
    public void washing () {
        System.out.println("Wash dishes");
    }
    public void cleaning () {
        System.out.println("Clean house");
    }
}
