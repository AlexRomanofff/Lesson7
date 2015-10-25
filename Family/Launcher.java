package Family;

public class Launcher {
    public static void main(String[] args) {

        Child child = new Child();
        Mother mum = new Mother();
        Dad dad = new Dad();
        Child daughter = new Child();
        daughter.setName("Katya");

        mum.washBaby(child);
        mum.washBaby(daughter);
        dad.loves(mum);
        child.play(dad);
        daughter.play(dad);

        System.out.println();
        Kids kid1 = new Kids();
        Kids kid2 = new Kids();
        Kids kid3 = new Kids();

        kid1.setName("Sasha");
        kid2.setName("Dasha");
        kid3.setName("Masha");

        kid1.friendship(kid2);
        kid2.friendship(kid3);
        kid3.friendship(kid1);
    }
}
