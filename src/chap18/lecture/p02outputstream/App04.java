package chap18.lecture.p02outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class App04 {
	public static void main(String[] args) {
		//picture/다형성01.png를
		//output/다형성01.png로 복사하는 코드
	
	
	String in = "picture/다형성01.png";
	String out = "output/다형성01.png";
	
	try ( InputStream is = new FileInputStream(in);
	OutputStream os = new FileOutputStream(out);) {
		int data = 0;
		byte[] datas = new byte[10000];
		
		while ((data=is.read(datas)) != -1) {
			os.write(datas,0,data);
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	System.out.println("프로그램 종료!!");
	

}

}
