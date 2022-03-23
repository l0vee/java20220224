package chap05.lecture;

public class C01EnhancedFor {
	public static void main(String[] args) {
		for (int i = 0; i< 3; i++) {
			System.out.println("그냥 for");
		}
		
		int[]arr1 = {100,200,300,400};
		for (int i = 0; i< arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		for(int item :arr1){ //타입변수:배열 ... 배열 아이템(100 200 300 400)의 개수만큼 반복 여기선 4번출력
			System.out.println(item);
			System.out.println("코드 반복!!");
			
		
		}
		
	}

}

