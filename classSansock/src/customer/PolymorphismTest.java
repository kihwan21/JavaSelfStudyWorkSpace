package customer;


public class PolymorphismTest {
	public static void main(String[] args) {

		PolymorphismTest test = new PolymorphismTest(); // PolymorphismTest 클래스에 정의된 calculatePrice를 사용하기 위한 instance

		Customer C = new Customer(1010, "CC");
		WhiteCustomer W = new WhiteCustomer(1011, "CW");
		BlackCustomer B = new BlackCustomer(1012, "CB");

		test.calculatePrice(C); //calculatePrice()메서드의 매개변수 customer의 데이터형은 Customer이므로, W와 B객체는 Up-casting되는 상황임
		test.calculatePrice(W);
		test.calculatePrice(B);
	}

	public void calculatePrice(Customer customer) { 
		System.out.println(customer.getCustomerName() + "님이 지불할 금액은 " + customer.calcPrice(10000) + "입니다.");
		// 각 등급별 할인율이 적용되어 있어 오버라이딩된 함수가 호출되었음을 알 수 있음.
		// 같은 코드로 오버라이드 개념을 활용하여 객체에 따라 서로 다른 결과를 보임 => 다형성의 구현이 가능함
	}
}
