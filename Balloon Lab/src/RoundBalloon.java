/**
 * Represents a balloon in the BalloonDraw program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.Color;
import java.awt.Graphics;

public class RoundBalloon extends Balloon
{
  /**
   * Constructs a balloon with the center at (0, 0),
   * radius 50, and blue color
   */
  public RoundBalloon()
  {
    super();
  }

  /**
   * Constructs a balloon with a given center, radius and color
   * @param x x-coordinate of the center
   * @param y y-coordinate of the center
   * @param r radius of the balloon
   * @param c color of the balloon
   */
  public RoundBalloon(int x, int y, int r, Color c)
  {
    super(x,y,r,c);
  }

  /**
   * Returns the x-coordinate of the center.
   */
 
  public void draw(Graphics g, boolean makeItFilled)
  {
	  int x = getX();
	  int y = getY();
	  int r = getRadius();
    g.setColor(getColor());
    if (makeItFilled)
      g.fillOval(x - r,
                 y - r, 2*r, 2*r);
    else
      g.drawOval(x - r,
                 y - r, 2*r, 2*r);
  }
}