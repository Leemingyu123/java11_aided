package nettest;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ClientTest4of2 {

	public static void main(String[] args) {
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
			Socket s = new Socket(ip, 3000);	
			//클라이언트 클래스의 Socket s = new Socket();부분의 서버 소켓의 ip주소와 토트번호가 지정되지않아 통신이 불가능하다
			//해당 ip와 토트번호를 
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
