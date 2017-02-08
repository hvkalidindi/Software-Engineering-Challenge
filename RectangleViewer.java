

/**
 * Write a description of class RectangleViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
public class RectangleViewer {    
    final static int ANIMATION_TIME_IN_SECONDS = 60;
    
    public static void main(String[] args) throws InterruptedException   
    { 
        JFrame frame = new JFrame();
        
      frame.setSize(600, 600);       
      frame.setTitle("Two rectangles");       
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      RectangleComponent component = new RectangleComponent();       
      frame.add(component);
      frame.setVisible(true);    
      
      RectangleComponent rect2 = new RectangleComponent(50,50,50,30); 
      frame.add(rect2);
      frame.setVisible(true);
      
      FaceComponent face = new FaceComponent();
      frame.add(face);
      frame.setVisible(true);

      for(int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds ++)
    {
      component.nextFrame();
      Thread.sleep(1000);
    } 
  }
}