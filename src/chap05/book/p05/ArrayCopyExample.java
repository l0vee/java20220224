package chap05.book.p05;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] OldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(OldStrArray, 0, newStrArray, 0, OldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}
	}
}
