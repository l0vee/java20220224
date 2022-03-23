package chap06.book.s060401;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student ();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 Student 또 다른 객체를 참조합니다.");
	}
	//파일 명  = 클래스 명
	// 보통 하나의 파일 = 하나의 클래스지만
	// 하나의 파일에 여러개의 클래스가 만들어지는 경우도 있다.

}
