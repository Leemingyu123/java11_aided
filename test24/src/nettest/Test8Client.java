package nettest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Test8Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;
		
		try {
			socket = new Socket("192.168.0.1", 8080);//서버의 ip주소가 다름127.0.0.1
			if(socket == null) {// == -> !=
				System.out.println("[Client]");
				System.out.println("서버와 연결 성공!");
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
