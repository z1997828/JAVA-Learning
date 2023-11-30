package tw.com.Andy;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Andy54 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			System.out.println("wait....");
			Socket socket = server.accept();
			
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader reader = new BufferedReader(isr);
			
			String line =""; StringBuffer sb = new StringBuffer();
			
			while((line = reader.readLine()) != null){
				sb.append(line + "\n");
			}
			
			InetAddress ip = socket.getInetAddress();
			
			reader.close();
			server.close();
			
			System.out.println(sb.toString());
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
