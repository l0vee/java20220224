package chap12.lecture.p01thread;

public class App04 {
	public static void main(String[] args) {
		
		System.out.println("쓰레드 실행 중....");
		
//		Thread.sleep(millis); // static method 인스턴스 생성 없이 바로 실행
		
		try {
		// sleep 현재 쓰레드 실행을 milliseconds 만큼 멈춤
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		
		System.out.println("쓰레드 실행 계속..........");
		
	}

}
