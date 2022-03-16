package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Chihuahua;

public class App07 {
	public static void main(String[] args) {
		Chihuahua chihuahua = new Chihuahua();
		chihuahua.breathe();
		chihuahua.cry();
		chihuahua.angry();
		
		Animal animal = chihuahua;
		animal.breathe();
		animal.cry();
		animal.angry(); /// xxx animal이 치와와인건 아니기 때문에 문법 오류
		
	}

}
