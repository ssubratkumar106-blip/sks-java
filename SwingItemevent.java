import javax.swing.*;
import java.awt.event.*;

public class CheckBoxExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Checkbox Event Demo");

        JCheckBox cb = new JCheckBox("I agree");
        JLabel msg = new JLabel("Status: Not selected");

        cb.setBounds(50, 50, 100, 30);
        msg.setBounds(50, 90, 200, 30);

        cb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cb.isSelected())
                    msg.setText("Status: Selected");
                else
                    msg.setText("Status: Not selected");
            }
        });

        frame.add(cb);
        frame.add(msg);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
