import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CircleDraw extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillOval(10, 10, 50, 50);
        g.drawString("Mohit Aggarwal", 60, 60);
        g.drawString("2250241453", 70, 70);
    }
}

/*
<Applet code="CircleDraw" height="500" width="500">
</Applet>
*/