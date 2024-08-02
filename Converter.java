import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Converter extends Applet implements ActionListener{
    TextField t1 = new TextField("Enter the temperature in celcius");
    Button b1 = new Button("Convert");
    boolean shouldShow = false;
    double temp;
    public void init(){
        add(t1);
        add(b1);
        b1.addActionListener(this);
    }
    public void paint(Graphics g){
        if(shouldShow){
            g.drawString("H" + t1.getText(), 40, 40);
            g.drawString("Temperature in Fahrenheit " + temp, 50, 50);
        }
    }
    public void actionPerformed(ActionEvent e){
        int celciusTemp = Integer.parseInt(t1.getText());
        temp = ((9*celciusTemp)/5) + 32;
        shouldShow = true;
        repaint();
    }
}

/*
<Applet code="Converter" height="500" width="500">
</Applet>
*/