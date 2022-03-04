package chap04.lecture.forloop;

public class C08For {
	public static void main(String[] args) {
		int[] arr1 = {3, 1, 9, 0, 7};
		
		//arr1에 있는 모든 값을 더해서 출력
		
		int sum = 0;
		
//		sum += arr1[0];
//		sum += arr1[1];
//		sum += arr1[2];
//		sum += arr1[3];
//		sum += arr1[4];
	
			
		for (int i =0; i< arr1.length; i++) {
			sum += arr1[i]; 			
	}
		System.out.println(sum);

		// arr1의 값 중 가장 큰 값을 출력 / 작은값을 출력
		
//		int max = arr1[0];
//		for (int i =0; i< arr1.length; i++) {
//			max = (max < arr1[i] ) ? arr1[i] : max ; //비교해서 큰 값만 남기기
//		}	
//			System.out.println(max);
//	}
	
		int max = arr1[0];
		for (int i =1; i< arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1 [i];
			}
		}
		System.out.println(max);

		
		int min = arr1[0];
		for (int i=1; i< arr1.length; i++) {
			if (min > arr1[i]) { // 비교후 더 작은값을
				min = arr1 [i]; // min으로 만든다.
			}
		}
		System.out.println(min);
		
	}
	
}
