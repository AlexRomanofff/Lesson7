package lesson_12.frame2_Balls.gate;

import javax.swing.*;
import java.awt.*;

public class ControlBarrier extends JPanel {

    private Car car;
    public Barrier barrier;

    public ControlBarrier() throws Exception {
        car = new Car(10, 150, 20, 40);
        barrier = new Barrier();
        JFrame f = new JFrame("Control Barrier");
        f.setLocation(400, 300);
        f.setMinimumSize(new Dimension(500, 400));
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
                    while (!barrier.isOpen) {
                        System.out.println("open barrier");
                        barrier.open();
                    }
                    synchronized (car) {
                        System.out.println("come in");
                        car.notify();
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }).start();
    }

    private void moveCar() throws Exception{
        while (car.getX()<450) {
            if (!barrier.isOpen && car.getX()>350) {
                synchronized (barrier) {
                    System.out.println("im here");
                    barrier.notify();
                }
                synchronized (car) {
                    try {
                        car.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            } car.setX(car.getX()+1);
               Thread.sleep(10);
        }
    }
}