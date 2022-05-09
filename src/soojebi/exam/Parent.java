package soojebi.exam;

public class Parent {
	public void show() {
		System.out.println("parent");
	}
}

class Child extends Parent{
	public void show() {
		System.out.println("Child");
	}
}

public class Main{
	public static void main(String args) {
		Parent pa = new Child();
		pa.show();
	}
}