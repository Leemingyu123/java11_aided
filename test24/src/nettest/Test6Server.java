package nettest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.util.Scanner;

public class Test6Server {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br= null;
		PrintWriter pw = null;
		int port = 3333;	//문제에서 제시한 포트번호가 다름, 3000임 소켓을 생성할수 없다.
		String serverIP = "127.0.0.1";
		ServerSocket server = null;
		try {
			server = new ServerSocket(serverIP, port);	//서버용소켓엔 포트번호만 있어야함, 서버소켓을 생성할 수 없다.
			System.out.println("[Server]");// accept  구문이 없다. Socket socket = server.accept();추가
			System.out.println("클라이언트의 요청을 기다리고 있습니다.");
			System.out.println(socket.getInetAddress().getHostAddress()+"가 연결을 요청함");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream));
			pw = new PrintWriter((socket.getOutputStream()));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
