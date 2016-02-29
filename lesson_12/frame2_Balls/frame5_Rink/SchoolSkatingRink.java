package lesson_12.frame2_Balls.frame5_Rink;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class SchoolSkatingRink implements SkatingRink {

    private Queue<Skates> skatesShelf = new LinkedBlockingDeque<>();

    public SchoolSkatingRink() {

        for (int i = 0; i<5; i++) {
            Skates skate = new Skates();
            skatesShelf.add(skate);
        }
    }

    @Override
    public Skates getSkates(Skater skater) {
        return skatesShelf.poll();
    }

    @Override
    public void returnSkates(Skates skates, Skater skater) {
        if (!(skates == null)) {
            System.out.println(skater.getName() + " return skates");
            skatesShelf.add(skates);
        }
    }
}
