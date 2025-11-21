import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {

    // Constructor
    MyFrame() {
        // Set title
        super("AWT Frame Example");

        // Create a button
        Button b = new Button("Click Me");

        // Set button position & size
        b.setBounds(80, 100, 100, 40);

        // Add button to frame
        add(b);

        // Frame settings
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new MyFrame();   // Create object → automatically displays frame
    }
}
