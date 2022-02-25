package chap03.lecture.binary;

public class C02Arithmetic {
	public static void main(String[] args) {
		int n1 = 2000000000;
		int n2 = 1000000000;
		
		System.out.println(n1 + n2); //overflow 계산할 수 있는 범위를 초과해서 마이너스로 표현되어버림
		
		int n3 = -2000000000;
		int n4 = -1000000000;
		
		System.out.println(n3 + n4); //underflow 표현할 수 있는 범위 초과
		
		long n5 = 2000000000;
		long n6 = 1000000000;
		System.out.println(n5 +n6);
		
		long n7 = -2000000000;
		long n8 = -1000000000;
		System.out.println((-n3)+(-n4));
		System.out.println(n7+n8);
	}

}
