package lesson_12.frame2_Balls.super_Rink;

import java.util.concurrent.Callable;

public interface SkatingRink {

    public Skates getSkates(Skater skater);

    public void returnSkates (Skates skates, Skater skater);

}
