package chap02.book;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for (int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " +var1 + "\t" + "var2: " + var2);
		}
		//byte 변수는 127 넘으면 -128로 회귀
		//int 변수는 정상적으로 1씩 증가함. 그래서 21억까지 문제없는 int로 바꿔주는 게 좋음
	}

}
