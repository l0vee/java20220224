package chap03.lecture.method;

public class C03Method {
	public static void main(String[] args) {
		myMethod1(300); //300
		myMethod1(900); //900
//		myMethod1(3.14); // x 왜? 정수만 되던가?? (확인하기)
		myMethod1('가'); //왜 44032야
		
		int j = 999;
		myMethod1(j); 
	}
	
	public static void myMethod1(int i) {
		System.out.println(i); //999 밖에서 정의되더라도 (강의확인. 0228 10시 30분)
	}
}