package lesson_12.frame2_Balls.frame5_Rink;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Good morning, we are opened");

        final SkatingRink skatingRink = new SchoolSkatingRink(5);
        final Random random = new Random();
        final List <Skater> waitSkaters = new ArrayList<>();

        for (int i=1; i<100; i++) {

            final Skater skater = new Skater("Skater "+i);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(skater.getName());

                    if(!skatingRink.isAvailability()) {
                        try {
                            synchronized (skater) {
                                System.out.println("Sorry "+skater.getName()+", skates are unavailability, wait please");
                                waitSkaters.add(skater);
                                skater.wait();
                            }
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                    Skates skates = skatingRink.getSkates(skater);
                    sleep(random.nextInt(2000));
                    skatingRink.returnSkates(skates, skater);
                    if (waitSkaters.size()>0) {
                        Skater waitSkater = waitSkaters.get(0);
                        waitSkaters.remove(0);
                        synchronized (waitSkater) {
                            waitSkater.notify();
                        }
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
