package soojebi;

public class P671 {
	private int sum;
	public int add(int a, int b) {
		sum = a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a, add(5,7));
	}
}
