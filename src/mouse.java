import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Mouse extends Frame implements MouseListener {

    Mouse()
    {
    }
    static JLabel label1 = new JLabel();

    static JLabel label2 = new JLabel();

    static JLabel label3 = new JLabel();
    // main class
    public static void main(String[] args)
    {
        JFrame f = new JFrame("MouseListener");

        f.setSize(600, 100);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();

        p.setLayout(new FlowLayout());



        Mouse m = new Mouse();

        f.addMouseListener(m);

        p.add(label1);
        p.add(label2);
        p.add(label3);

        f.add(p);

        f.show();
    }

    public void mousePressed(MouseEvent e)
    {

        label1.setText("mouse pressed at point:"
                + e.getX() + " " + e.getY());
    }

    public void mouseReleased(MouseEvent e)
    {

        label1.setText("mouse released at point:"
                + e.getX() + " " + e.getY());
    }

    public void mouseExited(MouseEvent e)
    {

        label2.setText("mouse exited through point:"
                + e.getX() + " " + e.getY());
    }

    public void mouseEntered(MouseEvent e)
    {

        label2.setText("mouse entered at point:"
                + e.getX() + " " + e.getY());
    }

    public void mouseClicked(MouseEvent e)
    {

        label3.setText("mouse clicked at point:"
                + e.getX() + " "
                + e.getY() + "mouse clicked :" + e.getClickCount());
    }
}