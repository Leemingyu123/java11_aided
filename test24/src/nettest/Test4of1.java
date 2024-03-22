package nettest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test4of1 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket();
			Socket s = server.accept();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
