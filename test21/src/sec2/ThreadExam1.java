package sec2;//채팅용 프로그램에 필수

import java.awt.Toolkit;

//Tread(쓰레드) = Process(프로세스) = 현제 컴퓨터에서 실행 중인 프로그램(작업)
//발생(New) => (실행대기:Runnable=)=> 점유(실행:run) => 실행대기:Runnable => 종료
//점유=>실행대기=>점유=>실행대기....
//실행=>실행대기 : sleep
//실행대기=>실행 : wake up(run)
public class ThreadExam1 {

	public static void firstThread()	{
		System.out.println("첫 번째 쓰레드");
	}
	
	public static void secondaryThread()	{
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<10;i++) {	//0~9까지 카운트 작업
			System.out.println(i);
			try {
				Thread.sleep(2000);	//sleep(실행->실행대기) //ms(밀리세컨드)1000ms=1초 => us
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {//new Thread(생성) => Runnable(실행대기)
			@Override
			public void run() {//run(실행대기 -> 실행)
				firstThread();
			}
		});	//실행가능한 작업
		thread1.run();
		thread1.start();	//스레드 먼저 진행한다.//준비하고있다가 다르작업 있으면 먼저 실행하고 실행됨
		System.out.println(thread1.getName());
		
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				secondaryThread();
			}
		});
		thread2.start();

	}

}
