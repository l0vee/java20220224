package chap07.lecture.p02override;

public class QuantumComputer extends Computer {
	
	// method override
	//상속받은 이미 있는 method가 마음에 들지 않아 재 정의 함
	// 같은 이름(파라미터 타입.순서.개수 다 같아야 재정의 가능,, 덮어씌우기
	//같은 이름의 메소드를 하위 클래스에서 다시 정의하는 것
	
	public void execute() {
			System.out.println("더 빠른 연산을 합니다.");
		}
	
	public void otherExecute() {
		System.out.println("다른 연산을 합니다.");
	}

}
