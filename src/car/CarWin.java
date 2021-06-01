package car;
import javax.swing.*;
import java.awt.*;
public class CarWin {
    static final int WIDTH = 600;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(WIDTH,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button1 = new JButton("HEllo");
        frame.add(button1, BorderLayout.SOUTH);
        frame.setVisible(true);


    }
}

