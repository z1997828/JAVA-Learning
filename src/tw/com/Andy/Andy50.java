package tw.com.Andy;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Andy50 {

	public static void main(String[] args) {
		
		try {
			InetAddress ip = InetAddress.getByName("www.iii.com.tw");
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println(e);
		}
	}

}
