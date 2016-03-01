package lesson_12.frame2_Balls.super_Rink;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class VIPSkatingRink implements SkatingRink {

    private Queue<Skates> skatesShelf = new LinkedBlockingDeque<>();

    public VIPSkatingRink() {

        for (int i = 0; i<5; i++) {
            Skates skates = new Skates();
            skatesShelf.add(skates);
        }
    }

    @Override
    public Skates getSkates(Skater skater) {
        System.out.println(skater.getName() + " got skates");
        return skatesShelf.poll();
    }

    @Override
    public void returnSkates(Skates skates, Skater skater) {

        System.out.println(skater.getName() + " return skates");
        skatesShelf.add(skates);
    }
}
