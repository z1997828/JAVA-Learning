package tw.com.Andy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Andy55 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(6666);
			System.out.println("wait....");
			Socket socket = server.accept();
			// server.accept(); 屬於不能自動關閉的方法
			InetAddress ip = socket.getInetAddress();
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(String.format("dir2/%s.jpg", ip.getHostAddress())));
			
			InputStream in = socket.getInputStream();
			BufferedInputStream bin = new BufferedInputStream(in);
			int len; byte[] buf = new byte[4*1024*1024];
			while( (len=bin.read(buf)) != -1) {
				bout.write(buf,0,len);
			}
			
			
			bout.flush();
			bout.close();
			in.close();
			server.close();
			
			System.out.println("收到了！");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
