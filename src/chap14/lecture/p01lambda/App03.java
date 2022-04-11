package chap14.lecture.p01lambda;
public class App03 {
	public static void main(String[] args) {
		MyInterface3 o2 = new MyInterface3() {
			
			public void method2() {
				
			}
			
			public void method1() {
				
			}
			
			
		};
		//추상메소드 1개 일때만 람다식 작성 가능
		MyInterface3 o3 = () -> {
			
		};
	}

}
