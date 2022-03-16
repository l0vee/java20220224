package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Canine;
import chap07.lecture.p99polymorphism_class.Chihuahua;
import chap07.lecture.p99polymorphism_class.Feline;
import chap07.lecture.p99polymorphism_class.StreetCat;

public class App10 {
	public static void main(String[] args) {
		//instanceof : 이항 연산자
		//좌항 : 참조변수, 우항: 타입명
		//연산결과: boolean, 참조변수가 가리키는 인스턴스가 타입과 일치하면 true 아니면 false
		
		Animal animal = new Chihuahua();
		
		boolean b1 = animal instanceof Animal; //b1 = true 치와와는 동물이 맞다
		System.out.println(b1);
		
		boolean b2 = animal instanceof Canine; //true 치와와는 개과이다
		System.out.println(b2);
		
		boolean b3 = animal instanceof Chihuahua; //true 치와와는 치와와이다.
		System.out.println(b3);
		
		boolean b4 = animal instanceof Feline; //false
		System.out.println(b4);
		
		boolean b5 = animal instanceof StreetCat; //false
		System.out.println(b5);
		
		//참조변수가 갖고있는 실제 인스턴스가 일치하는가
		
		if (animal instanceof Canine) {
			Canine canine = (Canine) animal;
		}
		
		if (animal instanceof Chihuahua) {
			Chihuahua chihuahua = (Chihuahua) animal;
			chihuahua.angry();
		}
		
		if(animal instanceof Feline) {
			Feline feline = (Feline) animal; //실행안됨
			
		}
 
		if (animal instanceof StreetCat) {
			StreetCat streetCat = (StreetCat) animal; //실행안됨
		}
	
	}

}
