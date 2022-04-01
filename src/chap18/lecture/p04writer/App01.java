package chap18.lecture.p04writer;

import java.io.FileWriter;
import java.io.Writer;

public class App01 {
	public static void main(String[] args) throws Exception {
		//Writer : 문자단위 출력 스트림
		
		String path = "output/WriterEx01.txt";
		Writer wr = new FileWriter(path);
		
		
		wr.write('a');
		wr.write('z');
		wr.write('한');
		wr.write('글');
		wr.write("우크라이나"); //한문자 아니면 ""고, 한 문자는 ''임
		wr.write(new char[] {'자', '바', '스', '프', '링'});
		wr.write(8800); //유니코드 (십진법으로 바꾼 것)
		wr.write('\u2260'); //위랑 같은 유니코드 
		
		
		wr.close();
		
		System.out.println("프로그램 종료");
	}

}
