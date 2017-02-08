

/**
 * Write a description of class RectangleComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
/*    A component that draws two rectangles. */
 public class RectangleComponent extends JComponent{     
    int x,y,w,h;
    Rectangle box;
    public RectangleComponent()
    {
        this.x = 5;
        this.y = 10;
        this.x = 20;
        this.h = 30;
        box = new Rectangle(x,y,w,h);
        
    }
    
    public RectangleComponent(int x, int y, int w, int h)
    {
        this.x = x;
        this.y = y;
        this.x = w;
        this.h = h;
        box = new Rectangle(x,y,w,h);
        
    }
    
     public void paintComponent(Graphics g)    {       
      // Recover Graphics2D       
      Graphics2D g2 = (Graphics2D) g;
      
      // Construct a rectangle and draw it       
      Rectangle box = new Rectangle(5, 10, 20, 30);       
      g2.draw(box);
      
      // Move rectangle 15 units to the right and 25 units down       
      box.translate(x + 10,y + 15);
      
      // Draw moved rectangle       
      g2.draw(box);    
    } 
    
    public void nextFrame()
    {
        box.translate(10,10);
        
        repaint();
    }
}