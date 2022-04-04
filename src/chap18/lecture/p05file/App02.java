package chap18.lecture.p05file;

import java.io.File;

public class App02 {
	public static void main(String[] args) {
		String path = "output/참조타입01_copy.png";
		File file1 = new File(path);
		
		System.out.println(file1.exists()); //이제 존재함
		
		file1.delete(); //지우기
		
		System.out.println(file1.exists()); //이제 존재하지 않음
		
		path = "output/other";
		File file2 = new File(path);
		
		file2.mkdir();
		
		path = "output/other1/other2/other3";
		File file3 = new File(path);
		file3.mkdirs(); //여긴 복수형인거 주목 (여러폴더 만들기)
		
		
	}

}
