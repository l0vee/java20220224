package chap13.lecture.p01generic;

import chap08.lecture.p01interface.example_class.Animal;
import chap08.lecture.p01interface.example_class.Chihuahua;


public class App04 {
	public static void main(String[] args) {
		Container4<String> o1 = new Container4<String>();
		Container4<Integer> o2 = new Container4<Integer>();
		Container4<Animal> o3 = new Container4<Animal>();
//		기본타입은 type parameter로 사용불가
//		8개 wrapper class 이용(auto boxing, unboxing)
		
		
		//생성자에 붙어있는 타입파라미터 대부분 같으므로 생략가능
		Container4<Chihuahua> o4 = new Container4<>(); //diamond
	}

}

class Container4<T> {
	public void method(T param) {
		
	}
}
