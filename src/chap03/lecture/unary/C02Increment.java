package chap03.lecture.unary;

public class C02Increment {
	public static void main(String[] args) {
		//증감연산자
		//증가  increment ++
		//감소 decrement --
		
		int i = 7;
		i++; // i = i + 1
		
		System.out.println(i);
		
		
		i++;
		System.out.println(i);// 9
		
		i--; // i = i -1
		System.out.println(i); //8
		
		i--;
		System.out.println(i); //7
		
		//증감연산자 위치: 피연산자 앞/뒤
		++i; // i = i + 1
		System.out.println(i); //8
	
		--i; // i = i - 1
		System.out.println(i); // 7
		
		System.out.println(i++); //7 직전 i를 사용
		System.out.println(i); //8
		
		System.out.println(i--); //8
		System.out.println(i); //7
		
		System.out.println(++i); //더한 다음에 사용이라 바로 8
		System.out.println(i); //8
		
		System.out.println(--i); // 7
		System.out.println(i); // 7
		
		
		
		int j = i++;
		int k = ++i;
		
		System.out.println(j); // 7
		System.out.println(k); // 9
		
		//권장사항
		int l  =i;
		i++;
		
		i++;
		int m = i;
		
	}
	
	


}
