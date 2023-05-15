// A MyApplet Applet
//save file as MyApplet.java
package Applet;
import java.applet.*;
import java.applet.Applet;
import java.awt.*;
public class MyApplet extends Applet
{
     public void paint(Graphics g)
    {
        g.drawString("Hello World", 20, 20);
    }
}

/*
  <HTML>
  <applet code ="MyApplet.class" CodeBase="" width= 300 height =400></applet>
  </HTML>
 */
