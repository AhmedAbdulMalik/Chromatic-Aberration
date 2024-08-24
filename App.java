import java.awt.*;
import javax.swing.*;


public class App {


    final static  int WIDTH=600;
    final static int HEIGHT=600;
    public static void main(String[] args) throws Exception {
        
        JFrame frame = new JFrame ("cromatic abberration");
   
        frame.setSize(WIDTH , HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setBackground(Color.blue);
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT) );
        panel.setFocusable(true);
        panel.requestFocus();

        IOImage img = new IOImage("./cc.png");

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
