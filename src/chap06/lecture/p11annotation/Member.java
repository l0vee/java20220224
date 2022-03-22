package chap06.lecture.p11annotation;

import java.util.Arrays;

import chap07.book.s0705.Car;

public class Member implements Cloneable{
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[]scores, Car car2) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car2;
	}
	
	public Member(String name2, int age2, int[] scores2, chap06.lecture.p11annotation.Car car2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//먼저 얕은 복사를 해서 name, age를 복제한다.
		Member cloned = (Member) super.clone();
		//scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		//깊은 복제된 Member 객체를 리턴
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

}
