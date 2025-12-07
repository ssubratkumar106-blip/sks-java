import java.awt.*;
import java.awt.event.*;

public class MyAWTFrame {
    public static void main(String[] args) {
        Frame fm = new Frame("My AWT Frame");

        // Set size of frame
        fm.setSize(400, 300);

        // Set layout (optional)
        fm.setLayout(new FlowLayout());

        // Add a label
        Label lbl = new Label("Hello, this is an AWT Frame!");
        fm.add(lbl);

        // Close window properly
        fm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Make frame visible
        fm.setVisible(true);
    }
}
