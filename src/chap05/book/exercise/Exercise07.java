package chap05.book.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		
		int[] array = {1, 5, 3, 8, 2};
		int max = array[0];
		
		
		for(int item : array) {
			if (item> max) {
				max = item;
			}
			
		}
		
		System.out.println("max : " + max);
	}

}
