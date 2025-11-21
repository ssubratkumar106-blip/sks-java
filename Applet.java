import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="SimpleApplet.class" width="300" height="200"></applet>
*/

public class SimpleApplet extends Applet {

    public void paint(Graphics g) {
        g.drawString("Hello, I am an Applet!", 50, 100);
    }
}
