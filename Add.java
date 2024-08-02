import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Add extends Applet implements ActionListener{
    Label l1 = new Label("Value 1:");
    Label l2 = new Label("Value 2:");
    TextField t1 = new TextField(5);
    TextField t2 = new TextField(5);
    Button btn = new Button("Add");
    int sum = 0;
    public void init(){
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(btn);
        btn.addActionListener(this);
    }
    public void paint(Graphics g){
        g.drawString("Sum = " + sum, 20, 70);
    }
    public void actionPerformed(ActionEvent e){
        int val1 = Integer.parseInt(t1.getText());
        int val2 = Integer.parseInt(t2.getText());
        sum = val1 + val2;
        repaint();
    }
}


/*
<Applet code="Add" height="150" width="200">
</Applet>
*/