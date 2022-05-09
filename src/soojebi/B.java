package soojebi;

public class B {
	//생성자는 해당 클래스의 객체가 생성될 때
	// 자동으로 호출되는 특수한 종류의 메서드
	// 일반적으로 클래스의 멤버 변수를 초기화하거나
	// 클래스를 사용하는데 필요한 설정이 있는 경우 사용
	// java : 클래스 명과 동일한 메서드명을 가지고, 반환 값이 없다.

	public B() {
		System.out.println("생성자1");
	}
	
	public B(int b) {
		System.out.println("생성자2");
	}
	
	public void finalize() {
		System.out.println("소멸자");
	}
	
	public void fn() {
		System.out.println("일반함수");
	}
	
	public static void main(String[] args) {
		B b = new B(5); //int 형 매개변수가 있는 생성자 호출
		
		b.fn(); //fn 메서드 호출
		b.finalize(); // 클래스가 소멸되면서 소멸자 호출
	}
}
