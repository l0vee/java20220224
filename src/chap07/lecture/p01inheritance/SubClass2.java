package chap07.lecture.p01inheritance;

public class SubClass2 extends SuperClass2 {
	public SubClass2 ( ) {
		super(); //생략해도 자동으로 추가됨/ 상위클래스의 생성자 호출 /가장위에
		System.out.println("서브클래스2 생성자 실행");
	}
}
