package nettest;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Test4of2 {

	public static void main(String[] args) {
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
			Socket s = new Socket();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
