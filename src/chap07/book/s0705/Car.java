package chap07.book.s0705;

public class Car {
//필드
	public int speed;
	public Object model;
	
public Car(Object model2) {
		// TODO Auto-generated constructor stub
	}

	//메소드
	public void speedUp( ) {speed += 1;}
	
//final 메소드
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
