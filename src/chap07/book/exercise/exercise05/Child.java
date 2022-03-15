package chap07.book.exercise.exercise05;

public class Child extends Parent {
	public int studentNo; //private 안된다?
	
	public Child(String name, int studentNo) {
		super(name); //생성자를 호출해야 한다
		this.name = name;
		this.studentNo = studentNo;
	}
	
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	
}
