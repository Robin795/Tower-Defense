import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
public class GameWindow extends JFrame{
	private int width;
	private int height;
	
	public GameWindow(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		setSize(width,height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void setVis(boolean visible) {
		setVisible(visible);
	}
	@Override
	public void paint(Graphics g) {
		Color black = new Color(0, 0, 0);
		g.setColor(black);
		g.drawLine(0, (height/2)+20 , width, (height/2)+20);
		g.drawLine(0 ,(height/2)-20 , width, (height/2)-20);
	}
}
