package chap09.lecture.p02annoymous;

public class App02 {
	public static void main(String[] args) {
		class MyLocalClass1 implements MyInterface1 {

			@Override
			public void method1() {
				System.out.println("마이로컬클래스1에서 재정의한 메소드1");
			}
			
		}
		
		MyInterface1 o1 = new MyLocalClass1();
		o1.method1();
	}

}