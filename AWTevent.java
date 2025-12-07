import java.awt.*;
import java.awt.event.*;

public class AWTButtonExample extends Frame implements ActionListener {

    Label label;
    Button button;

    AWTButtonExample() {
        label = new Label("Click the button");
        button = new Button("Click Me");

        button.addActionListener(this); // event handling

        add(label, BorderLayout.NORTH);
        add(button, BorderLayout.CENTER);

        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Button clicked!");
    }

    public static void main(String[] args) {
        new AWTButtonExample();
    }
}
