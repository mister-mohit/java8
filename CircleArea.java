import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CircleArea extends Applet implements ActionListener{
    TextField t1 = new TextField();
    Label l1 = new Label("Enter the radius of circle");
    Button btn = new Button("Get Area");
    int radius;
    double area;
    boolean shouldShow = false;
    public void init(){
        add(l1);
        add(t1);
        add(btn);
        btn.addActionListener(this);
    }
    public void paint(Graphics g){
        if(shouldShow){
            g.drawString("Area of circle is" + area, 20,40);
            g.drawOval(20, 40, radius, radius);
        }
    }

    public void actionPerformed(ActionEvent e){
        radius = Integer.parseInt(t1.getText());
        area = (22*(radius*radius));
        shouldShow = true;
        repaint();
    }
}

/*
<Applet code="CircleArea" height="500" width="500">
</Applet>
*/