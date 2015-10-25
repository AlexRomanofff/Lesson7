package Family;


public class Child {

    private String name = "Masha";
     Child () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void play (Dad dad) {
        System.out.println(name + " playing with " + dad.getName());
    }
}
