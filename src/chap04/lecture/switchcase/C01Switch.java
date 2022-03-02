package chap04.lecture.switchcase;

public class C01Switch {
	public static void main(String[] args) {
		
		System.out.println("stmt 1");
		switch(1) { //일치하는 것부터 실행한다 1이니까 1부터 실행. 실행 전 거는 안 씀
		case 1:
			System.out.println("stmt 2");
		case 2:
			System.out.println("stmt 3");
		case 3:
			System.out.println("stmt 4");
		}
		
		System.out.println("stmt 5");
	}

}
