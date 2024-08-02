import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Buttons extends Applet implements ActionListener{
    Button b1 = new Button("Draw Circle");
    Button b2 = new Button("Draw Triangle");
    int[] x = {10,40,70};
    int[] y = {100,60,100};
    String type;
    boolean shouldShow = false;
    public void init(){
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void paint(Graphics g){
        if(shouldShow){
            if(type.equals("Draw Circle")){
                g.fillOval(20, 100, 50, 50);
            }else{
                g.fillPolygon(x,y, 3);
            }
        }
    }
    public void actionPerformed(ActionEvent e){
        type = e.getActionCommand();
        shouldShow = true;
        repaint();
    }
}

/*
<Applet code="Buttons" height="500" width="500">
</Applet>
*/