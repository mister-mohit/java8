import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Length extends Applet implements ActionListener{
    TextField t1 = new TextField( 25);
    TextField t2 = new TextField( 25);
    Label l1 = new Label("Enter length of road 1");
    Label l2 = new Label("Enter length of raod 2");
    Button b1 = new Button("Display");
    boolean shouldShow = false;
    float totalLength;
    public void init(){
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        b1.addActionListener(this);
    }
    public void paint(Graphics g){
        if(shouldShow){
            g.drawString("Total Length " + totalLength + "km", 40, 80);
        }
    }
    public void actionPerformed(ActionEvent e){
        int len1 = Integer.parseInt(t1.getText());
        int len2 = Integer.parseInt(t2.getText());
        totalLength = (len1 + len2)/1000;
        shouldShow = true;
        repaint();
    }
}

/*
<Applet code="Length" height="500" width="500">
</Applet>
*/