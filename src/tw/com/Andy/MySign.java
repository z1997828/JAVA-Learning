package tw.com.Andy;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import tw.Andy.classes.MyPanel;

public class MySign extends JFrame{
	private MyPanel myPanel;
	
	public MySign() {
		super("簽名");
		
		setLayout(new BorderLayout());
		myPanel = new MyPanel();
		add(myPanel,BorderLayout.CENTER);
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MySign();

	}

}
