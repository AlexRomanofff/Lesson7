package Family;

/**
 * Created by Алекс on 22.10.2015.
 */
public class Kids {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Kids () {

    }
    void friendship (Kids kid){
        System.out.println(name + " friends with "+ kid.getName());
    }
}
