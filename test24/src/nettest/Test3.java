package nettest;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		output1();
	}
	public static void output1() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("test3.txt");
			String str = "kh정보교육원";
			for(int i=0; i<str.length() ; i++) {
				fos.write(str.charAt(i));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
