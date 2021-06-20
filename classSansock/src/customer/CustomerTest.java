package customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer Jung = new Customer();
		Jung.setCustomerID(1001);
		Jung.setCustomerName("Jung");

		Customer Choi = new Customer(1002, "Choi");
		System.out.println(Jung.showCustomerInfo());
		System.out.println(Choi.showCustomerInfo());
		System.out.println(Jung.getCustomerName() + "���� ������ �ݾ��� " + Jung.calcPrice(10000) + "�Դϴ�.");
		System.out.println(Jung.showCustomerInfo());
//White Grade
		System.out.println("White Grade============================");
		WhiteCustomer Hwang = new WhiteCustomer(1002, "Hwang");
		System.out.println(Hwang.showCustomerInfo());
		System.out.println(Hwang.getCustomerName() + "���� ������ �ݾ��� " + Hwang.calcPrice(20000) + "�Դϴ�.");
		System.out.println("���� ������ ���ʽ� ����Ʈ�� "+ Hwang.getBonusPoint()+ "�Դϴ�.");
		Hwang.setAgentID(50);
		System.out.println("���� ������ ������Ʈ ID�� "+ Hwang.getAgentID()+ "�Դϴ�.");
//Black Grade
		System.out.println("Black Grade============================");
		BlackCustomer Bae = new BlackCustomer(1002, "Bae");
		System.out.println(Bae.showCustomerInfo());
		System.out.println("���� ������ ������Ʈ ID�� "+Bae.getAgentID()+ "�Դϴ�.");
		
		System.out.println(Bae.getCustomerName() + "���� ������ �ݾ��� " + Bae.calcPrice(30000) + "�Դϴ�.");
		System.out.println("���� ������ ���ʽ� ����Ʈ�� "+Bae.getBonusPoint()+ "�Դϴ�.");
		System.out.println(Bae.spendFreeCoffee(4));
		System.out.println(Bae.spendFreeParking());
		
		System.out.println(Bae.getCustomerName() + "���� ������ �ݾ��� " + Bae.calcPrice(1000000) + "�Դϴ�.");
		System.out.println("���� ������ ���ʽ� ����Ʈ�� "+Bae.getBonusPoint()+ "�Դϴ�.");
		System.out.println(Bae.spendFreeCoffee(4));
		System.out.println(Bae.spendFreeParking());
		
		System.out.println(Bae.getCustomerName() + "���� ������ �ݾ��� " + Bae.calcPrice(50000) + "�Դϴ�.");
		System.out.println("���� ������ ���ʽ� ����Ʈ�� "+Bae.getBonusPoint()+ "�Դϴ�.");
		System.out.println(Bae.spendFreeParking());
		
		
		

	}

}
