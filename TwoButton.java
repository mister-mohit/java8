import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButton extends Applet implements ActionListener{
    Button b1 = new Button("Ok");
    Button b2 = new Button("Cancel");
    String str = "";
    public void init(){
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void paint(Graphics g){
        g.drawString(str, 20, 50);
    }
    public void actionPerformed(ActionEvent e){
        String str1 = e.getActionCommand();
        if(str1.equals("Ok")){
            str="OK Clicked";
        }else {
            str="Cancel Clicked";
        }
        repaint();
    }
}

/*
<Applet code="TwoButton" height="500" width="500">
</Applet>
*/
