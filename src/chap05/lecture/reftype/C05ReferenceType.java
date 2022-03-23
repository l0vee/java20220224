package chap05.lecture.reftype;

//인스턴스와 변수가 갖는 값은 분리되어 있다. int와 arr차이 보여주기

public class C05ReferenceType {	
	public static void main(String[] args) {
		int i1 = 3;
		method1(i1);
		
		System.out.println("main"); // 2번째 실행
		System.out.println(i1); 
		
		int[] arr1 = new int[] {3, 2, 1};
		method2(arr1);
		System.out.println("main"); //4번째 실행
		System.out.println(arr1[0]); 
	}
	
	public static void method2(int[] arr) {
		arr[0] = 30;
		System.out.println("method2"); //3번째 실행
		System.out.println(arr[0]);
	}
	
	public static void method1(int i) {
		i = 5;
		System.out.println("method1");  //1번째 실행
		System.out.println(i); 
	}
	
	
}
