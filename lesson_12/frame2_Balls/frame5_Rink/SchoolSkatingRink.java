package lesson_12.frame2_Balls.frame5_Rink;

public class SchoolSkatingRink implements SkatingRink {

    private int quantitySkates;
    private boolean isAvailability;

    public boolean isAvailability() {
        return isAvailability;
    }

    public SchoolSkatingRink(int quantitySkates) {
        this.quantitySkates=quantitySkates;
        isAvailability = true;
    }

    @Override
    public Skates getSkates(Skater skater) {
        System.out.println(skater.getName()+ " got skates");
        quantitySkates--;
        if (quantitySkates==0) {
            isAvailability=false;
        }
        return new Skates();
    }

    @Override
    public void returnSkates(Skates skates, Skater skater) {
        System.out.println(skater.getName()+" return skates");
        quantitySkates++;
        isAvailability=true;

    }
}
