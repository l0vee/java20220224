package chap03.lecture.binary;

public class C03Arithmetic {
	public static void main(String[] args) {
		double n1 = 0.1;
		double n2 = 0.2;
		
		//근사치 연산
		double n3 = n1 + n2;
		System.out.println(n3);
		
		// 무한대 infinity
		double n4 = 3.14;
		double n5 = 0.0;
		
		double n6=n4/n5;
		System.out.println(n6); //실수를 0으로 나누면 무한대
		System.out.println(-n6);
		
		double n7 =n4 % n5; // Not A Number(NaN)
		System.out.println(n7);
		
		// 정수를 0으로 나눔 -> Exception 발생
		int n8 = 3;
		int n9 = 0;
		
		int n10 = n8 / n9; //Exception 발생 후 프로그램 종료
		
		System.out.println("실행 이어짐"); // 이 앞에서 종료돼서 이거 안됨
	}

}
