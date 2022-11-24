import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class OnlyNumber extends JFrame{
    public static void main(String[] args) {
        new OnlyNumber().initComponent();
    }

    public void initComponent() {
        setLayout(new FlowLayout());
        JLabel lbl = new JLabel("Enter a number: ");
        JTextField textField = new JTextField(15);
        add(lbl);
        add(textField);

        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // if it's not a number, ignore the event
                }
            }
        });

        setSize(310, 70);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
