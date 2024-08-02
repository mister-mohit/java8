import java.applet.*;
import java.awt.*;

public class MyAppletParam extends Applet{
    public void paint(Graphics g){
        String str = this.getParameter("msg");
        g.drawString(str, 50, 20);
    }
}

/*
<APPLET CODE="MyAppletParam.class" HEIGHT="150" WIDTH="200">
<PARAM NAME="msg" VALUE="MOHITSHOWS" >
</APPLET>
*/