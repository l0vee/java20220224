package chap11.lecture.p01object;

public class App07HashCode {
	public static void main(String[] args) {
		Keyboard k1 = new Keyboard("abc");
		Keyboard k2 = new Keyboard("def");
		Keyboard k3 = new Keyboard("abc");
		
		System.out.println(k1.equals(k2));
		System.out.println(k1.equals(k3));
		
		System.out.println(k1.equals(k);
		System.out.println(k1.equals(k2));
		System.out.println(k1.equals(k2));
		
		
		
	}

}


class Keyboard {
	private String model;
	
	Keyboard(String model) {
	this.model = model;
	
	@Override
	public int hashCode() {
		return model.hashCode();
	}
	
	
	public boolean equals(Object obj) {
		if(obj instanceof Keyboard) {
			keyboard k = (keyboard) obj;
			
			return this.model.equals(k.model);
		}
		
		return false;
	}
	
	}
	
	
 }