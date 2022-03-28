package chap12.lecture.p01thread;

public class App10 {
	public static void main(String[] args) {
		//Thread실행2ㄱ가지
		//Thread 클래스 상속
//		Runnable 인티ㅓ페이스ㅡ 구현
		Thread t1 = new MyThread101();
		t1.start();
		
		Runnable r1 = new MyThread102();
		Thread t2 = new Thread(r1);
		t2.start();
		
	}

}

class MyThread101 extends Thread {
	@Override
	public void run() {
		System.out.println("쓰레드 101이 할 일");
	}
}

class MyThread102 extends Thread {
	@Override
	public void run() {
		System.out.println("쓰레드 102가 할 일");
	}
}