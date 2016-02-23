package lesson_12.frame2_Balls;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameField extends JPanel{

    List <Ball> balls;

    public GameField () throws InterruptedException{
        balls = new ArrayList<>();
        JFrame frame = new JFrame("Balls");
        frame.setLocation(750, 150);
        frame.setMinimumSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.setVisible(true);
        frame.pack();
        initBalls();
        createBall();
        while (true) {
            repaint();
        }

    }
    private void initBalls() {

        balls.add(new Ball(0,0,10, Color.cyan));
        balls.add(new Ball(0,90,20, Color.blue));
        balls.add(new Ball(0,30,3, Color.red));
        balls.add(new Ball(0,60,1, Color.green));
        balls.add(new Ball(0,120,30, Color.black));
        balls.add(new Ball(0,150, 5, Color.magenta));
        balls.add(new Ball(0,180, 8, new Color(255,100,50)));
        balls.add(new Ball(0,210, 4, new Color(255,255,100)));
        balls.add(new Ball(0,240, 2, new Color(255,255,255)));


    }

    private void createBall () {
       for( Ball b: balls) {
           b.start();
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Ball b: balls) {
            b.draw(g);
        }
    }
}
