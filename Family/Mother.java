package Family;


public class Mother {

    private String name = "Nadya";

    public String getName() {
        return name;
    }

    Mother () {

    }
    void washBaby (Child child) {

        System.out.println("Mama washing " + child.getName());
    }

}
