package chap13.book;

//public class Box {
//	private Object object;
//	public void set(Object object) {this.object = object;}
//	public Object get() { return object; }
//
//}

public class Box {
	private T t;
	public T get() {return t;}
	public void set(T t) {this.t = t;}
}
