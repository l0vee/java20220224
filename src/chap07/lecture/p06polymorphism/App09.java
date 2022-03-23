package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Chihuahua;
import chap07.lecture.p99polymorphism_class.StreetCat;


public class App09 {
//강제 형변환으로 인한 위험을 감수해야 하는 코드
	public static void main(String[] args) {
		Animal animal = new StreetCat();
		animal.breathe();
		animal.cry();
		
		//angry 메소드 실행하고 싶다
		Chihuahua chihuahua  = (Chihuahua) animal; //ClassCastException 발생
		chihuahua.angry();
		
		// *강제형변환(casting)은 매우 주의해서 작성해야 함. 프로그램을 바로 종료해 버리므로.
		
		System.out.println("명령문 진행 계속........");
	}
}
