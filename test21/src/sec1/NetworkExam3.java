package sec1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkExam3 {

	public static void main(String[] args) {
		
		InetAddress local;
		try {
			local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 ip주소 : "+local.getHostAddress());
			System.out.println("네트워크상 컴퓨터 이름 : "+local.getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		InetAddress[] iArr;
		try {
			iArr = InetAddress.getAllByName("www.google.com");
			System.out.println("www.google.com IP");
			for(InetAddress addr : iArr) 
			System.out.println(addr.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		
		/*//본인 컴퓨터의 ip주소 컴퓨터 이름 출력
		System.out.println("본인 컴퓨터IP주소, 컴퓨터 이름");
		InetAddress local;
		try {
			local = InetAddress.getLocalHost();
			System.out.println(local.getHostAddress());
			System.out.println(local.getHostName());
		} catch (UnknownHostException e) {		
			e.printStackTrace();
		}	
	
		
		//www.google.com의 연결 IP주소 출력
		System.out.println("\n구글 아이피");
		InetAddress[] goo;
		try {
			goo = InetAddress.getAllByName("www.google.com");
			System.out.println(goo.getLocalHost());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		InetAddress[] iArr;
		try {
			iArr = InetAddress.getAllByName("www.google.com");
			for(InetAddress addr : iArr) {
			System.out.println(addr.getLocalHost());	 
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}	*/
		

	}

}
