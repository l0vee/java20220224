package soojebi;

public class C {
	public void fn() {
		System.out.println("C");
	}
}


//P.6-77
//오버라이딩 : 하위 클래스에서
//상위 클래스 메서드를 재정의할 수 있는 기능

//메서드 이름, 매개변수 개수, 데이터 타입, 메서드 반환형 같아야 한다

//오버로딩: 동일 이름의 메서드를 매개변수만 다르게 하여 여러 개 정의할 수 있는 기능
//메서드 이름 다름, 매개변수 개수 또는 데이터 변수가 달라야 한다.
//반환형은 같거나 달라도 된다.

//생성자는 오버라이딩이 안됨(클래스랑 동일한 이름의 메서드)
//오버라이딩은 부모 자식 간 동일한 이름일 때 밑에서 위로 덮어써짐