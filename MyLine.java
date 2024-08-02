import java.applet.*;
import java.awt.*;


public class MyLine extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawLine(20,20,100,20);
        g.drawLine(20, 20, 20, 100);
        g.drawLine(100, 20, 20, 100);
    }
}

/*
<Applet code="MyLine" height="500" width="500">
<Param name="MyLine" value="Mohit Aggarwal will be a sensation in Tech World.">
</Applet>
*/