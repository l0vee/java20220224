package chap05.lecture.reftype;

//인스턴스와 변수가 갖는 값은 분리되어 있다.
public class C05ReferenceType {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 2, 1};
		method1(arr1);
		System.out.println(arr1[0]);
		
		int[] arr2 = new int[] {-3, -2, -1};
		method1(arr2);
		System.out.println(arr2[0]);
		
	}

	public static void method1 (int[] arr) {
		arr[0] = 30;
	}
}
