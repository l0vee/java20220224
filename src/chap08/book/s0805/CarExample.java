package chap08.book.s0805;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run(); //한국타이어가굴러갑니다4번
		
//		myCar.frontLeftTire = new KumhoTire(); //금호타이어가굴러갑니다1번
//		myCar.frontRightTire = new KumhoTire(); //금호타이어가굴러갑니다1번
		
		myCar.tires[0] = new KumhoTire(); //금호로바꿔
		myCar.tires[1] = new KumhoTire(); //금호로바꿔
		
		myCar.run(); //금호2번 + 한국타이어가굴러갑니다2번
	}

}
