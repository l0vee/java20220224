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
		System.out.println(i);// 4
		
		System.out.println((i<0) && (i++ <0)); // false // 단락 (short circuit) , 좌변에서 false니깐 i값 반영안됨
		System.out.println(i); //4
		
		System.out.println((i<0) || (i++ <0)); // false // 좌변만 봐도 각나옴
		System.out.println(i); // 5
		
		System.out.println((i>0) || (i++> 0)); // true // short circuit
		System.out.println(i); // 5// 연산을 하지 않았구나
		
		System.out.println((i>0) & (i++>0)); //true
		System.out.println(i);
		
		System.out.println((i<0) & (i++<0)); // short circuit xxxxxx
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
