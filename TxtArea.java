import java.applet.*;
import java.awt.*;

public class TxtArea extends Applet{
    TextArea t1 = new TextArea(10,10);
    TextArea t2 = new TextArea("Hello Sir",10,10);
    TextArea t3 = new TextArea();
    public void init(){
        t1.setText("Hello");
        add(t1);

        t2.setEditable(false);
        add(t2);

        add(t3);
    }
    public void paint(Graphics g){
        g.drawString("R" + t1.getText(), 200, 80);
    }
}


/*
<Applet code="TxtArea" height="500" width="500">
</Applet>
*/