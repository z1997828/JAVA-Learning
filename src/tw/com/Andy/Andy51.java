package tw.com.Andy;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Andy51 {

	public static void main(String[] args) {
		String mesg = "A";
		
		byte[] data = mesg.getBytes();
		
		
//		自動關閉的寫法，免寫.close()
		try(DatagramSocket socket = new DatagramSocket()) {
			
//			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(data,data.length,InetAddress.getByName("10.0.104.198"),8888);
			socket.send(packet);
//			socket.close();
			System.out.println("send OK!");
		} catch (Exception e) {
//		拋出例外也會自動關閉			
		
			System.out.println(e);
		}

	}

}
