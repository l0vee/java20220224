package chap08.book.s0807;

//부모 인터페이스
public interface ParentInterface { 
	public void method1();
	public default void method2() {/*실행문*/}

}
