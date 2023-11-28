package tw.com.Andy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.Andy.classes.MyPanel;
import tw.Andy.classes.MyPanelV2;

public class MySign extends JFrame {
	private MyPanel myPanel;
	private JButton clear, undo, redo, color, saveObj, loadObj,saveJPG;

	public MySign() {
		super("簽名App");

		setLayout(new BorderLayout());
		myPanel = new MyPanel();
		add(myPanel, BorderLayout.CENTER);

		JPanel top = new JPanel(new FlowLayout());
		clear = new JButton("Clear");
		top.add(clear);
		undo = new JButton("Undo");
		top.add(undo);
		redo = new JButton("Redo");
		top.add(redo);
		color = new JButton("Color");
		top.add(color);

		saveObj = new JButton("saveObj");
		top.add(saveObj);

		loadObj = new JButton("loadObj");
		top.add(loadObj);
		
		saveJPG = new JButton("saveJPG");
		top.add(saveJPG);

		add(top, BorderLayout.NORTH);

		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setupListener();
	}

	private void setupListener() {
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.clear();
			}
		});

		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.undo();
			}
		});

		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.redo();
			}
		});

		saveObj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();
				if(jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
					File saveFile = jfc.getSelectedFile();
					
					try {
						myPanel.saveObj(saveFile);
						System.out.println("存檔成功");
					} catch (Exception e1) {
						System.out.println(e1);;
					}
				}
			}
		});

		
		loadObj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();
				if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					File loadFile = jfc.getSelectedFile();
					try {
						myPanel.loadObj(loadFile);
						System.out.println("讀檔成功");
					} catch (Exception e1) {
						System.out.println(e1);;
					}
				}

			}
		});
		
		saveJPG.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser jfc = new JFileChooser();
				if(jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
					File saveFile = jfc.getSelectedFile();
					
					try {
						myPanel.saveObj(saveFile);
						System.out.println("存檔成功");
					} catch (Exception e1) {
						System.out.println(e1);;
					}
				}
			}
		});
		
		
//		color.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Color color = JColorChooser.showDialog(null, "Change Color", myPanel.getColor());
//				if (color != null) {
//					myPanel.setColor(color);
//				}
//			}
//		});
	}

	public static void main(String[] args) {
		new MySign();
	}

}
