package tw.Andy.classes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public MyPanel() {
		setBackground(Color.cyan);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
	}
}
