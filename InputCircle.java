    import java.applet.*;
    import java.awt.*;
    import java.awt.event.*;

    public class InputCircle extends Applet implements ActionListener{
        TextField t1 = new TextField("Enter the radius of the circle");
        TextField t2 = new TextField("Enter the color of the circle");
        Button btn1 = new Button("Submit");
        GridLayout grid = new GridLayout(10,1, 20, 10);
        int radius = 0;
        Color circleColor = Color.BLACK;
        boolean shouldPaint = false;
        public Color getColor(String clr){
            switch(clr){
                case "red":
                    return Color.RED;
                case "blue":
                    return Color.BLUE;
                case "yellow":
                    return Color.YELLOW;
                case "green":
                    return Color.GREEN;
                default:
                    return Color.BLACK;
            }
        }
        public void init(){
            setLayout(grid);
            add(t1);
            add(t2);
            add(btn1);
            btn1.addActionListener(this);
        }
        public void paint(Graphics g){
            if(shouldPaint){
                g.setColor(circleColor);
                g.fillOval(50, 50, radius, radius);
            }
        }
        public void actionPerformed(ActionEvent e){
            radius = Integer.parseInt(t1.getText());
            circleColor = getColor(t2.getText());
            shouldPaint = true;
            repaint();
        }
    }

    /*
    <Applet code="InputCircle" height="500" width="500">
    </Applet>
    */