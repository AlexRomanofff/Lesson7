package Lesson8.HM_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;


public class HM_8_2_Magic_Quadrant extends JPanel{
    private MagicQuadrant quadrant = new MagicQuadrant();
    private int x = 80;
    private int y = 80;
    private int side = 100;
    public HM_8_2_Magic_Quadrant () {

        JFrame frame = new JFrame("Magic Quadrant");
        frame.setMinimumSize(new Dimension(300, 300));
        frame.getContentPane().add(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if ((e.getX()>x && e.getX()<x+side) && (e.getY()>y && e.getY()<y+side)) {
                    repaint();
                }
            }
        });
    }
    public static void main(String[] args) {
        new HM_8_2_Magic_Quadrant();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        quadrant.draw(g);
    }



    private class MagicQuadrant {

        MagicQuadrant (){

        };
        private void draw(Graphics g) {
            Random r = new Random();
            int red = r.nextInt(255);
            int green = r.nextInt(255);
            int blue = r.nextInt(255);
            g.setColor(new Color(red, green, blue));
            g.fillRect(x,y,side,side);
            System.out.println( red + " "+green+ " "+blue);

        }

    }

}
