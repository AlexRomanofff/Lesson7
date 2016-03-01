package lesson_12.frame2_Balls.super_Rink;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Demo {

    public static void main(String[] args) {
        final SkatingRink skatingRink = new VIPSkatingRink();
        final Random random = new Random();

        ExecutorService executor = Executors.newFixedThreadPool(5);
        System.out.println("Hello, we are opened");

        try {
        for (int i=1; i<100; i++) {

            final Skater skater= new Skater("Skater "+i);

            executor.submit(new Runnable() {
                @Override
                public void run() {

                    Skates skates = skatingRink.getSkates(skater);
                    sleep(random.nextInt(1000));

                    skatingRink.returnSkates(skates,skater);
                    sleep(random.nextInt(2000));
                }
            });

        }
    } finally {
            executor.shutdown();
            System.out.println("Good bye");
        }
    }

    private static void sleep (int timeout) {
        try {
            Thread.currentThread().sleep(timeout);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
