package chap05.lecture.array;

public class C03Array {
	public static void main(String[] args) {
		int[] [] arr1 = new int[][] {{2,3},{10,20,30},{11,22}}; //각각 int 배열 (아이템은 각 int)
		
		System.out.println(arr1[0][0]); // 0번째의 0번째는 2
		System.out.println(arr1[1][1]);
		System.out.println(arr1[0][1]); //3
		System.out.println(arr1[2][0]); //11
		
		System.out.println("모든 아이템 탐색");
		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.println();
				
				//162page 2차원 배열 (배열의 배열) // 마지막 문장 수정하기
			}
		}
	}

}
