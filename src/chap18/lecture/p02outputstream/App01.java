package chap18.lecture.p02outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App01 {
	public static void main(String[] args) {
		//OutputStream : byte 단위 출력할 때 사용하는 클래스

		String fileName = "output/OutputStreamEx01.txt";

		try (OutputStream os = new FileOutputStream(fileName);) {

			os.write(99); //1 byte 쓰기 (int라서 3byte는 안씀)
			os.write(9999999); // 1byte 쓰기
			os.write(887979);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//		os.close();
		System.out.println("프로그램 종료....");
	}

}
