import java.applet.Applet;
import java.awt.*;

public class myapplet extends Applet {
    public void paint(Graphics g) {
        g.drawLine(20, 20, 180, 80); // Draws a line from point (20,20) to point (180,80)
    }
}

/*
<applet code="myapplet.class" width="200" height="180">
</applet>
*/
