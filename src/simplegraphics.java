import java.awt.*;

import javax.swing.*;
    public class simplegraphics extends JApplet{
        public void paint(Graphics g){
          g.setColor(Color.green);
          drawplusfractal(200,200,250,4,g);
        }
        public static void drawplus(int r,int x,int y, Graphics g){
          g.drawLine(x,y-(r/2),x,y+(r/2));
          g.drawLine(x-(r/2),y,x+(r/2),y);
        }
        public static void drawplusfractal(int x,int y,int r,int num,Graphics ctx){
          if (num>0){
            drawplus(r,x,y,ctx);
            drawplusfractal(x+(r/2),y,r/2,num-1,ctx);
            drawplusfractal(x-(r/2),y,r/2,num-1,ctx);
            drawplusfractal(x,y-(r/2),r/2,num-1,ctx);
            drawplusfractal(x,y+(r/2),r/2,num-1,ctx);
          }
        }
    }
