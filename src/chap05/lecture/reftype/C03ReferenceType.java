package chap05.lecture.reftype;

public class C03ReferenceType {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		
		System.out.println(s1 == s2); //false 
		
		int i1 = 3;
		int i2 = 3;
		
		System.out.println(i1 == i2); // true
		
	}
}
