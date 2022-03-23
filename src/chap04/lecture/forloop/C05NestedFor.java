package chap04.lecture.forloop;

public class C05NestedFor {
	public static void main(String[] args) {

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 3; i++) {
				System.out.println(i);
				
				// j = 0일때 0 1 2
				// j = 1일때 0 1 2
				// ;;; j = 4 일때 0 1 2
			}
		}
			
			//
			System.out.println("연습2");
			for(int i=0; i<3; i++) {
				for(int j =0; j<5 ; j++) {
					System.out.println(i+","+j);
					
//				    0,0
//					0,1
//					0,2
//					0,3
//					0,4
//					1,0
//					1,1
//					1,2
//					1,3
//					1,4
//					2,0
//					2,1
//					2,2
//					2,3
//					2,4

			}
		}
	}
}


