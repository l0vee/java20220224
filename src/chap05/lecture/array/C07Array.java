package chap05.lecture.array;
// 참조타입07.png
public class C07Array {
	public static void main(String[] args) {
		// 배열의 배열
		int[][] arr1 = { { 3, 5 }, { -2, -7 }, { 10, 30 } };
		int[][] arr2 = arr1;

		arr1[0][1] = 50;
		System.out.println(arr2[0][1]);
		
		arr2[1] = new int[] {300, 200, 100};
		System.out.println(arr2[1][0]); // 300
		System.out.println(arr1[1][0]); // 300

	}

}
