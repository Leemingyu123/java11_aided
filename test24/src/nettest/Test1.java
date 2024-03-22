package nettest;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		output1();
	}
	public static void output1() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("text.txt");
			String str = "안녕하세요!";
			for(int i=0; i<str.length() ;i++) {
				fos.write(str.charAt(i));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
