package chap02.lecture;

public class C13TypeConversion {

	public static void main(String[] args) {
		//실수끼리 연산 결과ㅏ: 큰 타입으로
		float f1 = 3.14F;
		float f2 = 9.1F;
		
		float f3 =f1 + f2;
		System.out.println(f3);
		
		double d1 = 3.14;
		double d2 = 9.1;
		
		double d3 = d1 + d2;
		System.out.println(d3);
		
		float f4 = 3.14F;
		double d4 = 9.1;
		
		float f5 = (float) (f4 + d4); //
		double d5 = f4 + d4;
		
		System.out.println(f5);
		System.out.println(d5);
		
		//정수와 실수를 섞어서 쓰면 큰 타입이 실수로 나온다 이건 14번째 파일에서
	}
}
