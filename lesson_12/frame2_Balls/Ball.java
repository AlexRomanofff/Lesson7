package lesson_12.frame2_Balls;

import java.awt.*;

public class Ball extends Thread {

    public Ball (int x, int y, int speed, Color color) {
       this.x=x;
       this.y=y;
       this.speed=speed;
       this.color = color;
    }

    private int x;
    private int y;
    private int speed;
    private Color color;

    @Override
    public void run() {
        moveBall();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    void draw(Graphics g)  {
         g.setColor(color);
          g.fillOval(x,y,15,15);
    }

    void moveBall() {
        int step=1;
        while (step<580) {
            setX(getX()+1);
            try {
                sleep(speed);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
            step++;
        }
        moveLeft(step);
    }

    private void moveLeft(int step) {
        while (step>0) {
            setX(getX()-1);
            try {
                sleep(speed);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }

            step--;
        } moveBall();
    }

}
