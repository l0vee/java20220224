package soojebi;

public class Soojebi {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = true;
		System.out.println(a&&b);
		System.out.println(a||b);
		
		a = true;
		b = false;
		System.out.println(a&&b);
		System.out.println(a||b);
		
		a=false;
		b=true;
		System.out.println(a&&b);
		System.out.println(a||b);
		
		a=false;
		b=false;
		System.out.println(a&&b);
		System.out.println(a||b);
		
	}

}
