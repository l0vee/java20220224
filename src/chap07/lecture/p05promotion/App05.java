package chap07.lecture.p05promotion;

public class App05 {
	public static void main(String[] args) {
		MyClass5 o1 = new MyClass5();
		o1.field = new SuperClass1();
		o1.field = new SubClass1(); // 자동 타입변환
	
		o1.setField2(new SuperClass1());
		o1.setField2(new SubClass1()); //자동 타입변환 // 북극곰은 곰이다
		
		SuperClass1 s1 = o1.getField2();
//		SubClass1 s2 = o1.getField2(); // 역으로는 자동타입변환 xxxxxxx //곰은 북극곰이다 명제 거짓
		SubClass1 s3 = o1.getField3();
		SuperClass1 s4 = o1.getField3();
	}
} //여러 클래스 작성시 public class는 하나고 그게 파일명이다.

	class MyClass5 {
		public SuperClass1 field;
		private SuperClass1 field2;
		private SubClass1 field3;
		
		public SubClass1 getField3() {
			return field3;
		}
		
		public SuperClass1 getField2() {
			return field2;
		}
		
		public void setField2(SuperClass1 field2) {
			this.field2 = field2;
		}
	
}
