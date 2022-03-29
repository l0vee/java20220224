package chap15.book.exercise.s1503;

import chap13.book.Box;
import chap13.book.Util;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer>box1 =Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		Box<String>box2 = Util.boxing("홍길동");
		String strValue = box2.get();
	}

}
