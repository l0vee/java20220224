package chap11.lecture.p01object;

public class App05Equals {
	public static void main(String[] args) {
	Car car1 = new Car("kia", "k5");
	Car car2 = new Car("kia", "k5");
	
	System.out.println(car1.equals(car2));  //만약 Car의 company와 model이 같으면 true
	
	}
}

class Car {
	private String company;
	private String model;
	
	
	
	public Car(String company, String model) {
		this.company = company;
		this.model = model;
		
		
		public boolean equals(Object obj) {
			if (obj instanceof Car)
			Car o = (Car) obj;
			
			return this.company.equals(o.company) && this.model.equals(o.model);
		}
		
		return false
	}
	
	

	해시코드 객체가 담길 서랍의 번호
	서랍의 공간에 여유가 있기 때문에 다른객체가 같은 서랍에 들어가기도 함
	같은객체는 꼭 같은 서랍에
	
	
	
	
	
	
}