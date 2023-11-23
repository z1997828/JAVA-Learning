package tw.com.Andy;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Andy25 extends JFrame{
	public Andy25() {
		super("Andy25");
		
		setLayout(new BorderLayout());
		JPanel panel =new JPanel();
		add(panel,BorderLayout.CENTER);
		
		
		MymouseListener listener = new MymouseListener();
		panel.addMouseListener(listener);
		panel.addMouseMotionListener(listener);
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Andy25();
		
	}
// 類別中的類別–巢狀類別

	private void m1() {System.out.println("m1()");}
	class MymouseListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("Click");
//			a++;
			m1();
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println(e.getX() + ", " + e.getY());

		}
	}

}

