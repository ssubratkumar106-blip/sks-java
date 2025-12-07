import javax.swing.*;
import java.awt.event.*;

public class SwingButtonExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Event Demo");
        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("Hello!");

        button.setBounds(100, 80, 100, 40);
        label.setBounds(120, 30, 200, 30);

        // event handling
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        frame.add(button);
        frame.add(label);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
