import java.applet.*;
import java.awt.*;

public class TxtField extends Applet{
    TextField t1 = new TextField(25);
    TextField t2 = new TextField("Hello Sir", 25);
    public void init(){
        t1.setText("Hello");
        add(t1);

        t2.setEditable(false);
        add(t2);
    }
    public void paint(Graphics g){
        g.drawString("R" + t1.getText(), 200, 80);
    }
}


/*
<Applet code="TxtField" height="500" width="500">
</Applet>
*/