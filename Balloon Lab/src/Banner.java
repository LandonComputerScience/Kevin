import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.JFrame;
import java.awt.Container;

public class Banner extends JPanel
				implements ActionListener{
private int xPos, yPos;
public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.setColor(Color.RED);
	g.drawString("Hello, Action!", xPos, yPos);
}
	
	}
