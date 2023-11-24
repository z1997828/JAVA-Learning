package tw.Andy.classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.com.Andy.MyPanel;

public class MySign extends JFrame {
	private MyPanel myPanel;
	private JButton clear, undo, redo,color;
	

	public MySign() {
		super("簽名");

		setLayout(new BorderLayout());
		myPanel = new MyPanel();
		add(myPanel, BorderLayout.CENTER);

		JPanel top = new JPanel(new FlowLayout());
		clear = new JButton("Clear");
		top.add(clear);
		undo = new JButton("undo");
		top.add(undo);
		redo = new JButton("redo");
		top.add(redo);
		color = new JButton("Color");
		top.add(color);

		add(top, BorderLayout.NORTH);

		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setupListener();
	}

	private void setupListener() {
		clear.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				myPanel.clear();
			}
		});
		undo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				myPanel.undo();
			}
		});

		color.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Color color = JColorChooser.showDialog(null, "Change Color", Color.BLUE);
			}
		});
	}

	public static void main(String[] args) {
		new MySign();

	}

}
