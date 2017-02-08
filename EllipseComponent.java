

/**
 * Write a description of class EllipseComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.util.Random;

public class EllipseComponent extends JComponent
{
    int x,y,w,h;
    EllipseComponent circle;
   
   public EllipseComponent()
   {
       Random gen = new Random();
       this.x = gen.nextInt(1000) + 1;
       this.y = gen.nextInt(1000) + 1;
       this.w = gen.nextInt(100) + 1;
       this.h = gen.nextInt(100) + 1;
     Ellipse2D.Double circle = new Ellipse2D.Double(x,y,w,h);
    }
    
    
   public EllipseComponent(int x, int y, int w, int h)
   {
       this.x = x;
       this.y = y;
       this.w = w;
       this.h = h;
   }
   
   public void paintComponent(Graphics g)
   {
       Graphics2D g2 = (Graphics2D) g;
       
       Ellipse2D.Double circle = new Ellipse2D.Double(x,y,w,h);
       g2.draw(circle);
       
   }
   
   /*public setPos ()
   {
       int horizontal = x;
       int vertical = y;
       
    }
   
   public setSize ()   
   {
     int 
       
    }
   public getx ()
   {
       return this.x;
    }
   
    
    public gety()
   {
       return this.y;
    }
    
    public getw ()
   {
       return this.w;
    }
    
    public geth ()
   {
       return this.h;
    }
    */
   
}
