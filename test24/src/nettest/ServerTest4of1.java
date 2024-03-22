package nettest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest4of1 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(3000);	
			Socket s = server.accept();
			//서버 클래스의ServerSocket server = new ServerSocket();구문에 토트번호가 지정되지않아 
			//서버소켓이 생성되지 못하여 통신을 할수 없다. 문제에서 제시한 3000번 토트번호
			//지정된 토트번호를
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
