package chap14.lecture.p01lambda;
//추상메소드가 하나만 있을때만 쓸 수 있다.
public class App02 {
	public static void main(String[] args) {
		MyInterface2 o1 = (int c, int e) -> {
				System.out.println(c);
				System.out.println(e);
						
		};
		
		MyInterface2 o2 = new MyInterface2() {

			@Override
			public void method1(int x, int y) {
				System.out.println(x);
				System.out.println(y);
				
			}
		
		
		}
	}


}

interface MyInterface2 {
	void method1(int a, int b);
}
