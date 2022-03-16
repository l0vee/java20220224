package chap07.book.exercise.exercise08;

public class Exercise08 {
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new D();
		B b3 = new E();
//		B b4 = (B) new A(;) ///xxx
				
		method(new B());
		method(new D());
		method(new E());
//		method((B)) new A()); /// xxx
	
		
		A a1 = new D();
		method((B) a1); // 실행문제없다. a1원래 본인이 a1이야.
		
		System.out.println("명령문 계속 진행...");
	}

	public static void method(B b) {
		
	}
}
