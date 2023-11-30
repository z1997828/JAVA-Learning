package tw.com.Andy;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Andy53 {

	public static void main(String[] args) {
		String mesg = "哦哦哦哦!";
		try {
			Socket client = new Socket(InetAddress.getByName("10.0.104.198"),9999);
			
			
			OutputStream out = client.getOutputStream();
			BufferedOutputStream bout = new BufferedOutputStream(out);
			
			bout.write(mesg.getBytes());
			bout.flush();
			bout.close();
			
//			System.out.println(mesg);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		

	}

}
