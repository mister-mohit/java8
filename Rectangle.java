import java.applet.*;
import java.awt.*;

public class Rectangle extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20, 20 , 300, 100);
        g.setColor(Color.white);
        g.drawRect(20,120,300,100);
        g.setColor(Color.green);
        g.fillRect(20,220,300,100);
    }
}

/*
<Applet code="Rectangle.java" height="500" width="500" >
</Applet>
*/