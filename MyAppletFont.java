import java.applet.*;
import java.awt.*;

public class MyAppletFont extends Applet{
    Font obj = new Font("Times New Roman", Font.BOLD, 20);

    // public void init(){
    //     obj c
    // }
    public void paint(Graphics g){
        
        g.setFont(obj);
        String str = this.getParameter("msg");
        g.setColor(Color.red);
        g.drawString("MohitRocks", 50, 20);
        g.drawString("font details" + g.getFont(), 50, 50);
        g.drawString("Color" + g.getColor(),100, 100);
    }
}

/*
<APPLET CODE="MyAppletFont" HEIGHT="500" WIDTH="500">
<PARAM NAME="msg" VALUE="MOHITROCKS">
</APPLET>
*/