package chap03.book.exercise;

public class Exercise06 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom =10;
		int height = 7;
		double area = (lengthTop + (double) lengthBottom) * height/ 2.0;
		System.out.println(area);
		
//		int로 하면 소수점을 정수처리해서 52 나옴 그래서 실수처리 하나라도 해줘야 정확한 소수점 값 나온다
	}
}
