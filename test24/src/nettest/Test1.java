package nettest;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		output1();
	}
	public static void output1() {
		FileWriter fos = null;	//fileWriter
		try {
			fos = new FileWriter("text.txt");
//fileoutputstream 클래스를 사용했기때문에  저장되는 데이터는 1byte단위 전송이므로  2byte인 한글문자는 정상적으로 출력되지 않는다.
//손상된다(정상적으로 인코딩되지않는다) 깨진다. 
//filewriter클래스로 문자단위 전송
			String str = "안녕하세요!";
			for(int i=0; i<str.length() ;i++) {
				fos.write(str.charAt(i));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}//예외의 발생 유무와 관계없이 사용한 자원은 반환되어야하므로 구문을작성하지 않았으므로 반환의무를 위배하게된다.
}//사용한 파일작업을 닫아서 반환해야한다. 닫지못하면 다른곳에서 이 파일에 접근을 못한다.
