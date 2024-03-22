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
		int port = 3333;
		String serverIP = "127.0.0.1";
		ServerSocket server = null;
		try {
			server = new ServerSocket(serverIP, port);
			System.out.println("[Server]");
			System.out.println("클라이언트의 요청을 기다리고 있습니다.");
			System.out.println(socket.getInetAddress().getHostAddress()+"가 연결을 요청함");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream));
			pw = new PrintWriter((socket.getOutputStream()));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
