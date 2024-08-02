import java.applet.*;
import java.awt.*;

public class Polygon extends Applet{

    int[] x = {10, 20, 30 , 40};
    int[] y = {60, 20, 20, 60};
    public void paint(Graphics g){

        g.setColor(Color.orange);
        g.fillPolygon(x, y, 4);
    }
}


/*
<Applet code="Polygon" height="500" width="500">
</Applet>
*/