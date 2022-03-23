package chap02.lecture;

public class C01Variable {
	public static void main(String[] args) {
		// 변수 선언
		// 타입 변수명;
		int var1;
		
		// 변수명 : 
		// 영문대소문자, 숫자, $, _
		// 숫자로 시작할 수 없음
		// 자바 예약어(keyword, reserved word) 사용 못함
		
//		int int; // 안됨
		int name; // ok
//		int 3name; // not ok
		int my_name; // ok but xxx
		
		// 변수명 작성 관습
		// lowerCamelCase
		int myName; // ok 
		
		// 변수에 저장된 값을 다른 명령문에서 사용 가능
		// 변수에 값 저장(할당, 대입)
		int var2;
		var2 = 3; // 할당(대입)연산자 사용
		
		System.out.println(var2);
		
		var2 = 5;
		System.out.println(var2);
		
		// 변수 선언과 값 할당 
		int var3 = 10;
		
		System.out.println(var3);
		
		var3 = 11;
		System.out.println(var3);
		
	}
	
}
		