package chap18.lecture.p02outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class App06 {
	public static void main(String[] args) throws Exception {
		String in = "src/chap18/lecture/p02outputstream/App06.java";
		String out = "output/OutputStreamEx06.txt";
		
		InputStream is = new FileInputStream(in);
		OutputStream os = new FileOutputStream(out);
		
		byte[] datas = new byte[100];
		int len = 0;
		
		//최대 100개를 읽어서 저장, 몇 개 읽었는지를 리턴함
		while ((len= is.read(datas)) != -1) {
			os.write(datas, 0, len);		
		}
		
		
		os.close();
		is.close();
		
		System.out.println("프로그램 종료!!!!");
		
	}

}
