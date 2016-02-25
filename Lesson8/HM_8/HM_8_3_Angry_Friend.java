package Lesson8.HM_8;

import com.sun.awt.AWTUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Random;

public class HM_8_3_Angry_Friend extends JPanel{
    private Ball ball = new Ball();
    private int x=100;
    private int y=100;
    private final int diametr = 100;
    private Random r = new Random();


    public HM_8_3_Angry_Friend() {
        JFrame frame = new JFrame("Catch ball");
        frame.setMinimumSize(new Dimension(600,600));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.setVisible(true);
        frame.pack();

        JLabel label = new JLabel("Click on ball, you will win a prize");
        label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        add(label);
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if ((e.getX()>x-5 && e.getX()<x+diametr+5)&&(e.getY()>y-5 && e.getY()<y+diametr+5)){
                    repaint();

                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                if ((e.getX()>x-5 && e.getX()<x+diametr+5)&&(e.getY()>y-5 && e.getY()<y+diametr+5)){
                    repaint();

                }
            }
        });
    }
    private class Ball {

        public void draw (Graphics g) {
            x = r.nextInt(500);
            y = r.nextInt(500);
            g.setColor(new Color(0,150,255));
            g.fillOval(x,y,diametr,diametr);
            g.setColor(Color.YELLOW);
            g.setFont(new Font(Font.SERIF, Font.ITALIC, 21));
            g.drawString("Press me", x+10, y+55);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ball.draw(g);
    }

    public static void main(String[] args) {
        new HM_8_3_Angry_Friend();
    }
}
