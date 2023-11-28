package tw.com.Andy;

public class Andy47 {

	public static void main(String[] args) {
		Andy471 t1 = new Andy471("A");
		Andy471 t2 = new Andy471("B");
		Andy472 t3 = new Andy472("C");
		Thread t4 = new Thread(t3);
		t1.start(); t2.start();t4.start();
		System.out.println("main");
		
//  run = 使用物件方法執行 , 
//	start = 用物件生命的方式執行程式，執行完生命就結束了
	}

}

class Andy471 extends Thread{
	String name;
	Andy471(String name){this.name = name;}
	
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
//	在指定的毫秒數內暫止目前的執行緒。				
			} catch (InterruptedException e) {
				
			}
		}
	
	}
}

class Andy472 implements Runnable {
	String name;
	Andy472(String name){this.name = name;}
	
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
//	在指定的毫秒數內暫止目前的執行緒。				
			} catch (InterruptedException e) {
				
			}
		}
	
	}
}