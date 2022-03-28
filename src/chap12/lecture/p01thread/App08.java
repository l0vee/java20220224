package chap12.lecture.p01thread;

public class App08 {
	static int shareVar =0;
	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			public void run() { //클래스 구현과 인스턴스 생성을 동시에
				for (int i = 0; i < 1000000; i++) {
					shareVar++;

				}
				System.out.println("thread81 :" +shareVar);
			};
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 1000000; i++) {
					shareVar++; //(effective final이 아니어도 된다.)

				}
				
				System.out.println("thread82 : " + shareVar);
			};
		};
		
		t1.start();
		t2.start();

	}

}
