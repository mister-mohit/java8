import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Input extends Applet implements ActionListener{
    TextField t1 = new TextField("Enter your Name", 25);
    TextField t2 = new TextField("Enter your address", 25);
    Button b1 = new Button("Display");
    boolean shouldShow = false;
    double temp;
    public void init(){
        add(t1);
        add(t2);
        add(b1);
        b1.addActionListener(this);
    }
    public void paint(Graphics g){
        if(shouldShow){
            g.setColor(Color.ORANGE);
            g.drawString("Name " + t1.getText(), 40, 40);
            g.setColor(Color.RED);
            g.drawString("Address " + t2.getText(), 40, 60);
        }
    }
    public void actionPerformed(ActionEvent e){
        shouldShow = true;
        repaint();
    }
}

/*
<Applet code="Input" height="500" width="500">
</Applet>
*/