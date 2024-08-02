import java.applet.*;
import java.awt.*;

public class Oval extends Applet {
    public void init(){
        setBackground(Color.red);
    }
    public void paint(Graphics g){
        g.setColor(Color.orange);
        g.fillOval(20, 30, 70, 50);
        g.setColor(Color.green);
        g.fillOval(20,80, 70, 70);
    }
}

/*
<Applet code="Oval" height="500" width="500">
</Applet>
*/