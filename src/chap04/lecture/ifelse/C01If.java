package chap04.lecture.ifelse;

public class C01If {
	public static void main(String[] args) {
		System.out.println("statement 1");//출력
		
		if(false) {
			System.out.println("statement 2"); // false출력안됨
			System.out.println("statement 3");// false출력안됨
		}
		System.out.println("statement 4");//출력
	}
}
