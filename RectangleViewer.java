

/**
 * Write a description of class RectangleViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
public class RectangleViewer {    
    public static void main(String[] args)    
    { JFrame frame = new JFrame();
        
      frame.setSize(600, 600);       
      frame.setTitle("Two rectangles");       
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      RectangleComponent component = new RectangleComponent();       
      frame.add(component);
      frame.setVisible(true);    
      
      //RectangleComponent component2 = new RectangleComponent(100,100,50,30); 
      //frame.add(component);
      //frame.setVisible(true);
    } 
}