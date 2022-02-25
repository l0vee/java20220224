package chap03.lecture.binary;

public class C06Logical {
	public static void main(String[] args) {
		// 논리연산자
		// &&(AND short circuit), ||(OR short circuit)
		// &&(AND), ||(OR)
		// &(AND), |(OR), ^(XOR)
		// 피연산자 : boolean
		// 연산결과 : boolean
		
		// AND &&
		// 양변 모두 true일 때만 true, 나머지 모두 false
		System.out.println("AND &&");
		System.out.println(true && true);// true //좌변이 true면 우변이 true인지 가능성이 있으니 확인
		System.out.println(true && false);// false 
		System.out.println(false && true);// false // 좌변이 false면 넌 글렀다... 가능성 없음
		System.out.println(false && false);// false
		
		// OR ||
		// 양변 모두 false일 때만 false, 나머지 모두 true
		System.out.println("OR ||");
		System.out.println(true || true);// true
		System.out.println(true || false);// true
		System.out.println(false || true);// true
		System.out.println(false || false);// false
		
		//short circuit
		int i = 3;
		System.out.println((i>0) && (i++>0)); // true // 양변을 모두 판단해서 우측 연산하고 i값에 반영
		System.out.println(i);// 4 // 좌측 true 여서 우측도 확인해보려고 연산했더니 4 됨
		
		System.out.println((i<0) && (i++ <0)); // false // 좌변에서 false니깐 i값 반영안됨
		System.out.println(i); //4 // 4로 시작했는데 좌측 false라 우측 연산 안한거임.
		
		System.out.println((i<0) || (i++ <0)); // false // 좌우 둘다 false지만, 좌측 false면 우측 검사
		System.out.println(i); // 5 // 4로 시작했는데 ||는 좌측 false 일때 우측 검사하므로 연산함
		
		System.out.println((i>0) || (i++> 0)); // true // short circuit
		System.out.println(i); // 5// 연산을 하지 않았구나 좌측 true면 그냥 true라서 검사 안함
		
		System.out.println((i>0) & (i++>0)); //true (이건 short circuit 아님)
		System.out.println(i); //6
		
		System.out.println((i<0) & (i++<0)); // false // short circuit xxxxxx
		System.out.println(i); //7 연산했구나
		
		// ^ (XOR) EXCLUSIVE OR (배타적 OR)
		// 양변이 다를 때만 true, 같으면 false
		System.out.println("^(XOR)");
		System.out.println(true^true); //false
		System.out.println(true^false); //true
		System.out.println(false^true); //true
		System.out.println(false^false); //false
	}

}
