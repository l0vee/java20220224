package chap05.lecture.string;

public class C01String {
	public static void main(String[] args) {
		String s1 = new String("java");//참조변수
		String s2 = new String("java");//참조변수
		
		System.out.println(s1); //java
		System.out.println(s2); //java
		System.out.println(s1 == s2); //엥 java같은데 false? 참조값 다름 ㅇㅇ 비교하삼
		
		System.out.println(s1.equals(s2)); //내용물 비교
		
		String s3 = "java"; //new 안써도 됨 자주쓰는거라 string은
		String s4 = "java";	
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3 == s4); //참조값 비교
	}

}
