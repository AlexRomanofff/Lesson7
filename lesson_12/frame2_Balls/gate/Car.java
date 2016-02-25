package lesson_12.frame2_Balls.gate;

import java.awt.*;
import java.util.Random;

public class Car{

    private int height;
    private int width;
    private Color color;
    private int x;
    private int y;
    private Random r;
    private int green;
    private int red;
    private int blue;

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

    public Car(int x, int y, int height, int width) {
        r= new Random();
        green=r.nextInt(255);
        blue = r.nextInt(255);
        red = r.nextInt(255);
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        color = new Color(red,green,blue);
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}