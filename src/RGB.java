import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RGB extends Frame implements ActionListener {
    TextField t;
    RGB()
    {
        t=new TextField();
        t.setBounds(60,50,170,20);
        Button b1=new Button("R");
        b1.setBounds(60,80,30,20);
        Button b2=new Button("G");
        b2.setBounds(100,80,30,20);
        Button b3=new Button("B");
        b3.setBounds(140,80,30,20);
        add(t);
        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new RGB();
    }

    @Override
    public void actionPerformed(ActionEvent b1) {
        t.setText("COLOUR");
        t.setBackground(Color.red);
    }
}