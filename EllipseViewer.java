

/**
 * Write a description of class EllipseViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;

public class EllipseViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(1000,1000);
      frame.setTitle("Two rectangles");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      for (int x = 1; x < 10; x++)
      {
      EllipseComponent round = new EllipseComponent();
      frame.add(round);
      frame.setVisible(true);
    }
   }
}
