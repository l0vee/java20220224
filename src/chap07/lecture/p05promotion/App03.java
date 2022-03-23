package chap07.lecture.p05promotion;

public class App03 {
	public static void main(String[] args) {
		
	}

	public static SuperClass1 method1() {
		SuperClass1 o1 = new SuperClass1();
		SubClass1 o2 = new SubClass1(); //어떻게든 리턴키워드를 만나 오른쪽 참조값이 SuperClass로
		
//		method1(o3);
//		method1(o2);
//		method1(new SubClass1()); // 자동 타입변환
//		
//		return o1;
//		return o2; // SubClass1은 SuperClass1이랑 같으니깐 가능
		return new SubClass1();
	}
}
