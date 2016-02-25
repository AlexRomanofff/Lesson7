package Lesson8;



import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

public class MyFirstWindow  extends JPanel{

    private final static String IMAGE_NAME = "water.png";
    private final static String IMAGE_TANK = "BT7_64x64_right.png";
    private BufferedImage dest;
    private Image iwater;
    private Image itank2;
    private float f = 0.3f;

    public MyFirstWindow () {
       try {
            iwater = ImageIO.read(new File(IMAGE_NAME));
            itank2 = ImageIO.read(new File(IMAGE_TANK));

        } catch (IOException e) {
            System.err.println("Can't find image: " + IMAGE_NAME);
        }


        JFrame f = new JFrame("Lesson 8");
        f.setLocation(300,100);
        f.setMinimumSize(new Dimension(800,600));
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.getContentPane().add(this);
        f.pack();
        f.setVisible(true);


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        g2D.setColor(Color.magenta);
        g2D.fillRect(0,0,800,600);
        g2D.setColor(Color.cyan);
        g2D.setFont(new Font ("Verdana", 2, 21));
        g2D.drawString("Hello", 65, 65);
        g2D.setColor(Color.BLACK);
        g2D.setFont(new Font (Font.SERIF, Font.PLAIN, 21));
        g2D.drawString("My name is Alex", 129,222);
        g2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,0.1f));
        g2D.drawImage(iwater, 300,300,new ImageObserver() {
            @Override
        public boolean imageUpdate(Image img, int infoflags, int x, int y, int w, int h) {
            return false;
        }

        });



        g2D.setComposite(AlphaComposite.getInstance(AlphaComposite.DST_OVER,1f));

        g2D.drawImage(itank2, 300,300,new ImageObserver() {
            @Override
        public boolean imageUpdate(Image img, int infoflags, int x, int y, int w, int h) {
            return false;
        }
        });

    }

    public static void main(String[] args) throws  Exception{
        new MyFirstWindow();
    }

}
