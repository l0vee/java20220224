package chap07.lecture.p07abstract;

public abstract class Canine {
	//개과 (추상 클래스는 개념일 뿐 얘로 인스턴스 만들수가 없어짐)
	
	
	
	//본문(코드블럭)이 없는 메소드는 추상메소드
	// abstract 키워드 작성해야함
	public abstract void play() {
		
		// 추상메소드를 갖는 클래스는 꼭 추상클래스여야 한다.
		
		public void bark() {
			System.out.println("멍멍!!!!");
		}
		
		
	}
}
