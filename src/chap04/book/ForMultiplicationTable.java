package chap04.book;

public class ForMultiplicationTable {
	public static void main(String[] args) {
		// 2단 ~ 9단
		for (int m =2; m<=9; m++) {
			System.out.println("***"+m+"단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m+"x"+n+"="+(m*n));
			}
		}
		
		// 9단 ~ 2단
		
		for (int m =9; m>=2; m--) {
			System.out.println("***"+m+"단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m+"x"+n+"="+(m*n));
			}
		}
		
		// 9x9 =81 ~~~~ 2x1 =2
		
		for (int m =9; m>=2; m--) {
			System.out.println("***"+m+"단 ***");
			for (int n=9; n>=1; n--) {
				System.out.println(m+"x"+n+"="+(m*n));
			}
		}
	}
}
