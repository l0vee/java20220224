package chap07.book.s0705;

public class SportsCar {
	@Override
	public void speedUp() { speed += 10; }
	
	//stop()메소드를 final로 선언했으므로 오버라이딩을 할 수 없음
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0 ;
		
		
	}

}
