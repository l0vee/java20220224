package chap08.lecture.p01interface.example_class;

public class Chihuahua extends Canine implements Pet{

	@Override
	public void cry() {
		System.out.println("멍멍");
		
	} //실제로 존재할 수 있는 인스턴스의 설계도이므로 치와와 자체는 추상메소드가 없다. 근데 상속땜에.

	@Override
	public void roll() {
		System.out.println("물어버립니다.");
		
	}

}
