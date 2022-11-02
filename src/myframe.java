import java.awt.*;

public class myframe {
    public static void main(String[] args) {
        Frame fr=new Frame("Welcome Vaibhav");
        fr.resize(500,500);
        fr.setBackground(Color.cyan);
        fr.setLayout(null);

        Panel p=new Panel();
        p.setBounds(100,150,100,200);
        p.setBackground(Color.blue);
        fr.add(p);

        Button b1=new Button("Vaibhav");
        b1.setBounds(300,225,80,40);
        b1.setBackground(Color.orange);
        fr.add(b1);

        fr.show();
    }
}
