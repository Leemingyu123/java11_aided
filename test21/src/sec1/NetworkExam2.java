package sec1;

import java.net.InetAddress;
import java.net.UnknownHostException;
//파일, 데이터베이스, 네트워크 등은 외부 지원으로서 반드시 try/catch 처리 해야 한다.
public class NetworkExam2 {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();	//현재 컴퓨터 IP주소 불러오기
			System.out.println(local.getHostAddress());
			System.out.println(local.getHostName());
			InetAddress[] iArr = InetAddress.getAllByName("www.naver.com");	//네이버
			for(InetAddress addr : iArr) {
				System.out.println(addr.getLocalHost());	 
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
