package tw.com.Andy;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Andy52 {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			socket.close();
			System.out.println("Receive OK!");
			
			int len = packet.getLength();
			byte[] data = packet.getData();
			InetAddress urip = packet.getAddress();
			System.out.printf("%s : %s", urip.getHostAddress(),new String(data,0,len));
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
