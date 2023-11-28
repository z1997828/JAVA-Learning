package tw.Andy.classes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.DebugGraphics;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private LinkedList<LinkedList<HashMap<String, Integer>>> lines,recycle;
	

	public MyPanel() {
		setBackground(Color.YELLOW);

		lines = new LinkedList<>();
		recycle = new LinkedList<>();

		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);

	}

	// @Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
//	強制轉型 g2d 成 Graphics2D 
		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(5));

		for (LinkedList<HashMap<String, Integer>> line : lines) {
			for (int i = 1; i < line.size(); i++) {
				HashMap<String, Integer> p0 = line.get(i - 1);
				HashMap<String, Integer> p1 = line.get(i);
				g2d.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"));
			}
		}
	}

//	內部類別，好處是不用傳遞參數，直接沿用外部類別的屬性
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			recycle.clear();
			
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX());
			point.put("y", e.getY());
			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
			line.add(point);

			lines.add(line);
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX());
			point.put("y", e.getY());

			lines.getLast().add(point);
			repaint();
		}
	}

	public void clear() {
		lines.clear();
		repaint();
	}

	public void undo() {
		if (lines.size() > 0) {
			recycle.add(lines.removeLast());
			repaint();
		}
	}

	public void redo() {
		if (recycle.size() > 0) {
			lines.add(recycle.removeLast());
			repaint();
		}
	}
	public void saveObj(File file) throws Exception {
		ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
		
		oout.writeObject(lines);
		oout.flush();
		oout.close();
	}
	
	public void loadObj(File file) throws Exception{
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
		Object obj = oin.readObject();		
		
		
		if (obj instanceof LinkedList) {
			lines = (LinkedList<LinkedList<HashMap<String, Integer>>>)obj;
			repaint();
		} else {
			throw new Exception("err04");
		}
		oin.close();
	}
	
	public void saveJPEG() {
		BufferedImage img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		
		Graphics g = img.getGraphics();
		paint(g);
		
		try {
			ImageIO.write(img, "jpg",new File("dir1/Andy.jpg"));
			
			System.out.println("成功");
			
			
		} catch (IOException e) {
			System.out.println("失敗");
		}
	}
	
	
	
}
