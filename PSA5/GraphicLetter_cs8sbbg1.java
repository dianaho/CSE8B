/**
 * A class that represents the initials of my name
 * Author: Diana Ho
 * PID: A10573610
 * Login: cs8sbbg
 * PSA: 5
 * Date: May 5, 2014
 */

import java.awt.*;
import javax.swing.JPanel;

/** This class extends GraphicLetter and overrides some of their methods
  * It will implement GraphicLetter and creates a GUI of a letter of 
  * our name.
  */

public class GraphicLetter_cs8sbbg1 extends GraphicLetter
{
  /** This method will return a character representation of the letter
    * that the graphic depicts    
    * @return a char representation of the letter 'D'
    */
  public char whichChar()
  {
    return 'D';
  }
  
  /** This method will return a new instance of the graphic character object
    * that is implemented in this class
    * @return a GraphicLetter object
    */
  public GraphicLetter makeCopy()
  {
    return new GraphicLetter_cs8sbbg1();
  }
  
  /** This method returns a dimension object that specifies the size
    * at which your graphic letter displays best
    * @return returns a dimension object
    */
  public Dimension getPreferredSize()
  {
    return new Dimension(80,80);
  }
  
  /** This method will draw the graphic letter
    * @param g A graphic object representation
    */
  protected void paintComponent( Graphics g )
  {
    // Call the paintComponent of the JPanel.  
    // Leave this line in when you add to this method.
    super.paintComponent(g);
    
    // Making resizeable parameters for graphical shapes
    int x = getWidth() / 60;
    int y = getHeight() / 5;
    
    g.fillArc(x, y, (int)(getWidth()*0.9), (int)(getHeight()*0.6), 270, 180);
    
    g.setColor( Color.WHITE );
    
    g.fillArc(x + (int)(getWidth()*0.4), y + (int)(getHeight() * 0.2),
              (int)(getWidth()*0.3), (int)(getHeight()*0.3), 270, 180);
  }
}