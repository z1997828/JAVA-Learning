package tw.com.Andy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Andy56 {

	public static void main(String[] args) {
		String mesg = "哦哦哦哦!";
		try {
			File source = new File("dir2/cat.jpg");
			byte[] buf = new byte[(int)source.length()];
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(source));
			bin.read(buf);
			bin.close();			
			
			Socket client = new Socket(InetAddress.getByName("10.0.104.198"),6666);

			BufferedOutputStream bout = new BufferedOutputStream(client.getOutputStream());
			
			bout.write(buf);
			bout.flush();
			bout.close();
			
			client.close();
			
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		

	}

}
