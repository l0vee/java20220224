package soojebi;

public class A {
	private int a;
	public void setA(int a) {
		
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.setA(5);
		System.out.println(a.getA());
	}
}
