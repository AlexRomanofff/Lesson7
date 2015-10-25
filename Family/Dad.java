package Family;


public class Dad {

    private String name = "Alex";

    Dad () {

    }

    public String getName() {
        return name;
    }

    void loves (Mother mum) {
        System.out.println(name + " kiss " +mum.getName());
    }


}
