package chap07.book.s070704;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //자동타입변환 Vehicle vehicle = bus; 버스가 달립니다.
		driver.drive(taxi); //자동타입변환 Vehicle vehicle = taxi; 택시가 달립니다.
	}

}
