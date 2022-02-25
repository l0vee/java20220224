package chap03.lecture.binary;

public class C05Comparison {
	public static void main(String[] args) {
		//비교 연산자
		// >, >=, <, <=, ,== ,!=
		// 결과 type : boolean;
		
		int i1 = 3, i2 =5;
		
		System.out.println(i1 == i2); //같으면 true 틀리면 false 여기서 3과 5 다르므로 false
		System.out.println(i1 != i2); // 같으면 false 틀리면 true
		System.out.println(i1 > i2); // 왼쪽 값이 크면 true, 아니면 false
		System.out.println(i1 >= i2); // 왼쪽 값이 크거나 같으면 true, 아니면 false
		System.out.println(i1 < i2); // 왼쪽 값이 작으면 true, 아니면 false
		System.out.println(i1 <= i2); // 왼쪽 값이 작거나 같으면 true, 아니면 false
		
		System.out.println(3.14 <= 9.9);
		System.out.println('A' <= 'B'); //unicode 비교
//		System.out.println('A'+ 0);

		
		// 실수는 근사치로 저장되니깐 주의해야 함
		// 실수 type 비교
		double v4 = 0.1;
		float v5 = 0.1f;
		
		System.out.println(v4 == v5); //false가 나온다. 둘이 같아보이지만 아니라고 근삿값 다르다고.
		
		
	}

}
