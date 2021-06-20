package customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer Jung = new Customer();
		Jung.setCustomerID(1001);
		Jung.setCustomerName("Jung");

		Customer Choi = new Customer(1002, "Choi");
		System.out.println(Jung.showCustomerInfo());
		System.out.println(Choi.showCustomerInfo());
		System.out.println(Jung.getCustomerName() + "님이 지불할 금액은 " + Jung.calcPrice(10000) + "입니다.");
		System.out.println(Jung.showCustomerInfo());
//White Grade
		System.out.println("White Grade============================");
		WhiteCustomer Hwang = new WhiteCustomer(1002, "Hwang");
		System.out.println(Hwang.showCustomerInfo());
		System.out.println(Hwang.getCustomerName() + "님이 지불할 금액은 " + Hwang.calcPrice(20000) + "입니다.");
		System.out.println("현재 고객님의 보너스 포인트는 "+ Hwang.getBonusPoint()+ "입니다.");
		Hwang.setAgentID(50);
		System.out.println("현재 고객님의 에이전트 ID는 "+ Hwang.getAgentID()+ "입니다.");
//Black Grade
		System.out.println("Black Grade============================");
		BlackCustomer Bae = new BlackCustomer(1002, "Bae");
		System.out.println(Bae.showCustomerInfo());
		System.out.println("현재 고객님의 에이전트 ID는 "+Bae.getAgentID()+ "입니다.");
		
		System.out.println(Bae.getCustomerName() + "님이 지불할 금액은 " + Bae.calcPrice(30000) + "입니다.");
		System.out.println("현재 고객님의 보너스 포인트는 "+Bae.getBonusPoint()+ "입니다.");
		System.out.println(Bae.spendFreeCoffee(4));
		System.out.println(Bae.spendFreeParking());
		
		System.out.println(Bae.getCustomerName() + "님이 지불할 금액은 " + Bae.calcPrice(1000000) + "입니다.");
		System.out.println("현재 고객님의 보너스 포인트는 "+Bae.getBonusPoint()+ "입니다.");
		System.out.println(Bae.spendFreeCoffee(4));
		System.out.println(Bae.spendFreeParking());
		
		System.out.println(Bae.getCustomerName() + "님이 지불할 금액은 " + Bae.calcPrice(50000) + "입니다.");
		System.out.println("현재 고객님의 보너스 포인트는 "+Bae.getBonusPoint()+ "입니다.");
		System.out.println(Bae.spendFreeParking());
		
		
		

	}

}
