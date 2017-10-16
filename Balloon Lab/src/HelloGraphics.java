import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloGraphics extends JPanel {
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		
		g.drawRect(20, 40, 150, 45);
		
		g.setColor(Color.BLUE);
		g.drawString("Hello, Graphics!", 55, 65);
	}
	
	public static void main(String [] args){
		JFrame window = new JFrame("Graphics Demo");
		window.setBounds(300,300,200,150);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HelloGraphics panel = new HelloGraphics();
		panel.setBackground(Color.WHITE);
		Container c = window.getContentPane();
		c.add(panel);
		
		window.setVisible(true);
		
	}
}
