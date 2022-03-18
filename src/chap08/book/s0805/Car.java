package chap08.book.s0805;

public class Car {
	//인터페이스 타입 필드 선언과 초기 구현 객체 대입
//	Tire frontLeftTire = new HankookTire();
//	Tire frontRightTire = new HankookTire();
//	Tire backLeftTire = new HankookTire();
//	Tire backRightTire = new HankookTire();
	
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
			
	};

	void run() {
		//인터페이스에서 설명된 roll() 메소드 출력
//		frontLeftTire.roll();
//		frontRightTire.roll();
//		backLeftTire.roll();
//		backRightTire.roll();

		for(Tire tire : tires) {
			tire.roll();
		}
	}

}
