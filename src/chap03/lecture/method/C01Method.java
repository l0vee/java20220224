package chap03.lecture.method;

public class C01Method {
	public static void main(String[] args) {
		
		System.out.println("명령문 1");
		System.out.println("명령문 2");
		mymethod1(); // 메소드 호출
//		(저 밑에 있는 메소드가 먼저 실행되고 명령문 3은 마지막)
//		명령문1 -> 명령문2-> 마이메소드1 ->마이메소드2 -> 명령문3
		
		System.out.println("명령문 3");
		
	}
	
	// 메소드 정의
	public static void mymethod1() {
		System.out.println("마이메소드1");
		System.out.println("마이메소드2");
	}

	
}
