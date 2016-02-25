package lesson_12.frame2_Balls.gate;

import javax.swing.*;
import java.awt.*;
import java.time.Year;

public class ControlBarrier extends JPanel {

    private Car car;
    public Barrier barrier;
    public static final int ENTRANCE = 350;
    public static final int PARKING_SEAT = 530;
    public static final int PARKING_AREA = 400;

    public ControlBarrier() throws Exception {
        car = new Car(10, 150, 20, 40);
        barrier = new Barrier();
        JFrame f = new JFrame("Control Barrier");
        f.setLocation(400, 300);
        f.setMinimumSize(new Dimension(600, 400));
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.getContentPane().add(this);
        f.pack();
        f.setVisible(true);
        openBarrier();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    moveCar();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }).start();


        while (true) {
            repaint();
            Thread.sleep(100);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        car.draw(g);
        barrier.draw(g);
    }


    private void openBarrier() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (barrier) {
                        System.out.println("waiting for the car");
                        barrier.wait();
                    }
                        openingAction();
                        while (barrier.isOpen) {
                            barrier.close();

                    }

                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }


        }).start();
    }

    private void moveCar() throws Exception{
        while (car.getX()<PARKING_SEAT) {
            if (!barrier.isOpen && car.getX()==ENTRANCE) {
                synchronized (barrier) {
                    System.out.println("i'm here");
                    barrier.notify();
                }
                synchronized (car) {
                    try {
                        car.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            } else if (barrier.isOpen && car.getX()==PARKING_AREA) {
                System.out.println("i'm in");
                synchronized (barrier) {
                    barrier.notify();
                }
            }
                car.setX(car.getX()+1);
               Thread.sleep(10);
        }
    }
    private void openingAction() {
        while (!barrier.isOpen) {
            System.out.println("open barrier");
            barrier.open();
        }
        try {
            synchronized (car) {
                System.out.println("go");
                car.notify();
            }
            synchronized (barrier) {
                barrier.wait();
            }

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}