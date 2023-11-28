package tw.com.Andy;

public class Andy48 {

	public static void main(String[] args) {
		Andy481 obj1 = new Andy481();
		Andy482 obj2 = new Andy482();
		obj1.setDaemon(true);
		obj2.setDaemon(false);
		obj1.start();
		obj2.start();

	}

}

class Andy481 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("A:"+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
			
		}
	}
}

class Andy482 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("B:"+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
			
		}
	}
}