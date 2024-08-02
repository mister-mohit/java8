import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Table extends Applet implements ActionListener{
    TextField tf = new TextField();
    Button btn = new Button("Generate Table");
    int num;
    boolean shouldShow = false;
    public void init(){
        add(tf);
        add(btn);
        btn.addActionListener(this);
    }
    public void paint(Graphics g){
        if(shouldShow){
            g.drawString("Table of " + num, 20, 15);
            if(num >= 1 && num <= 21){
                for(int i = 1; i <= 10; i++){
                    int height = 20 + i*10;
                    g.drawString("" + num*i, 20, height);
                }
            }else{
                g.drawString("Number can only between 1 and 20", 20, 15);
            }
        }
    }
    public void actionPerformed(ActionEvent e){
        num = Integer.parseInt(tf.getText());
        shouldShow = true;
        repaint();
    }
}

/*
<Applet code="Table" height="500" width="500">
</Applet>
*/