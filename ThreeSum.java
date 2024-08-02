import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ThreeSum extends Applet implements ActionListener{
    TextField tf1 = new TextField("Enter Number");
    TextField tf2 = new TextField("Enter Number");
    TextField tf3 = new TextField("Enter Number");
    Button btn = new Button("Add Numbers");
    boolean shouldShow = false;
    double sum;
    public void init(){
        add(tf1);
        add(tf2);
        add(tf3);
        add(btn);
        btn.addActionListener(this);
    }
    public void paint(Graphics g){
        if(shouldShow){
            g.drawString("Sum: " + sum, 60, 60);
        }else{
            g.drawString("Sum: ", 60, 60);
        }
    }
    public void actionPerformed(ActionEvent e){
        double num1 = Double.parseDouble(tf1.getText());
        double num2 = Double.parseDouble(tf2.getText());
        double num3 = Double.parseDouble(tf3.getText());
        sum = num1 + num2 + num3;
        shouldShow = true;
        repaint();
    }
}

/*
<Applet code="ThreeSum" height="500" width="500">
</Applet>
*/