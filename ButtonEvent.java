import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEvent extends Applet implements ActionListener{
    Button btn = new Button("Click me");
    String str = "";
    public void init(){
        add(btn);
        btn.addActionListener(this);
    }
    public void paint(Graphics g){
        g.drawString(str, 20, 50);
    }
    public void actionPerformed(ActionEvent e){
        str="Hello Mohit";
        repaint();
    }
}

/*
<Applet code="ButtonEvent" height="500" width="500">
</Applet>
*/