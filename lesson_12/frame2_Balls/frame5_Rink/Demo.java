package lesson_12.frame2_Balls.frame5_Rink;


import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Good morning, we are opened");

        final SkatingRink skatingRink = new SchoolSkatingRink();
        final Random random = new Random();
        final Queue<Skater> waitSkaters = new LinkedBlockingDeque<>();

        for (int i=1; i<20; i++) {

            final Skater skater = new Skater("Skater "+i);

            new Thread(new Runnable() {
                @Override
                public void run() {

                    Skates skates = skatingRink.getSkates(skater);

                    if (skates==null) {
                        waitSkaters.add(skater);
                        try {
                            synchronized (skater) {
                                skater.wait();
                            }
                        }catch (InterruptedException ex) {
                            // ignore
                        }
                        skates = skatingRink.getSkates(skater);

                    }
                    System.out.println(skater.getName() + " got skates");
                    sleep(random.nextInt(1000));

                    skatingRink.returnSkates(skates, skater);

                        Skater waitSkater = waitSkaters.poll();

                        try {
                            synchronized (waitSkater) {
                                waitSkater.notify();
                            }
                        } catch (NullPointerException ex) {
                            // ignore
                    }
                }
            }).start();
        } sleep(random.nextInt(1000));
    }
    private static void sleep (int timeout) {
        try {
            Thread.currentThread().sleep(timeout);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
