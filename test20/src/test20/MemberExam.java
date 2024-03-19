package test20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section.Member;

public class MemberExam {
	Scanner sc = new Scanner(System.in);
	List<Member> memList = new ArrayList<>();
	boolean t= true;
	
	public static void main(String[] args) {
		MemberExam app = new MemberExam();
		app.mainCall();
	}
	//메뉴를 반복 호출하고, 키보드에서 각 해당 번홀르 누르면 각 작업이 이루어 질 수 있도록 하시오.
	public void mainCall() {		//1.회원가입, 2.회원목록, 3.회원삭제, 4.프로그램 종료
		
		while(t) {
			System.out.println("\n1.회원가입, 2.회원목록, 3.회원삭제, 4.프로그램 종료");
			System.out.print("작업번호 :");
			int job = sc.nextInt();
			switch (job) {
			case 1:
				add();
				break;
			case 2:
				info();
				break;
			case 3:
				remove();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
					t = false;
			}
		}	
	}
	public void add() {
		System.out.print("아이디 입력 :");
		String id = sc.next();
		System.out.print("레벨 입력 :");
		int mcode = sc.nextInt();
		System.out.print("이름 입력 :");
		String name = sc.next();
		System.out.print("비밀번호 입력 :");
		String pw = sc.next();
		System.out.print("전화번호 입력 :");
		String tel = sc.next();
		System.out.print("출생년도 입력 :");
		int year = sc.nextInt();
		memList.add(new Member(mcode, name, pw, tel, year, id));
		System.out.println("새로운 회원 등록");
	}
	public void info() {
		for(Member s: memList) {
			System.out.print(s.toString());
		}
	}
	public void remove() {
		System.out.println("제거할 아이디 입력 : ");
		String id = sc.next();
		for(int i=0;i<memList.size();i++) {
			System.out.println("제거 : "+memList.get(i).toString());
			memList.remove(i);
		}
	}
}
		/*while(t) {
			System.out.println("1.회원가입, 2.회원목록, 3.회원삭제, 4.프로그램 종료");
			int i=sc.nextInt();
			switch (i) {
				case 1 :
					System.out.println("1.회원가입");
					memList.add( );
					break;
				case 2 :
					System.out.println("2.회원목록");
					System.out.println(memList);
					break;
				case 3 :
					System.out.println("3.회원삭제");
					
					break;
				case 4 :
					System.out.println("4.프로그램 종료");
					t = false;
					break;
				
			}
		}*/
	
	
	


