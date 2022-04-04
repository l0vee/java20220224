package chap18.lecture.p06filter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class App03 {
	public static void main(String[] args) throws Exception{
		String path = "src/chap18/lecture/p06filter/App03.java";
		normalReader(path);
		bufferedReader(path);		
	}
	
	private static void bufferedReader(String path) throws Exception {
		Reader rd = new FileReader(path);
		Reader br
		= new BufferedReader(rd);
		
		
		int data = 0;
		
		long start = System.currentTimeMillis();
		while ((data= br.read()) != -1) {
//			System.out.println();
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end- start);
		
		
		br.close();
		rd.close();
	}
		
	private static void normalReader(String file) throws Exception {	
		Reader rd = new FileReader(file);
		
		int data = 0;
		
		long start = System.currentTimeMillis();
		while ((data = rd.read()) != -1) {
			
			//하드디스크에서 하나의 문자를 읽어서 리턴하고
			//포문 돌아서 다음 문자, 다음 문자
			
			System.out.println();
		}
		
		rd.close();
		
		
		//만약 여러 문자를 올려놓고 대기한다면? bufferedread
		
		
		long end = System.currentTimeMillis();
		System.out.println(end- start);
		rd.close();
				
	}
}
