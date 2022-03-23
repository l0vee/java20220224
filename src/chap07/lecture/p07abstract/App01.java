package chap07.lecture.p07abstract;

public class App01 {
	public static void main(String[] args) {
		Canine c1 = new Chihuahua();
		Canine c2 = new JindoDog();
//		Canine c3 = new Canine(); // xx 추상클래스로 인스턴스 만들 수 없음
		
		//....
		
		
		c1.play();
		c2.play();
		
		method(c1);
		method(c2);
	}

	public static void method(Canine dog) { //상위클래스에서 재정의했으니까 문제없이 실행가능
		dog.play();
	}
	
}