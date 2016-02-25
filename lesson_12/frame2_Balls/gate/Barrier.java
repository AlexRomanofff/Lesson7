package lesson_12.frame2_Balls.gate;

import java.awt.*;

public class Barrier{

    private int x;
    private int y;
    private int width;
    private int height;
    protected boolean isOpen;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Barrier () {
        x=400;
        y=110;
        width= 10;
        height=100;
    }
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x,y,width,height);
    }

    public void open() {
        while (height>0) {
            height--;
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        } isOpen = true;
    }
}
