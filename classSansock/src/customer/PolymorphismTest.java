package customer;


public class PolymorphismTest {
	public static void main(String[] args) {

		PolymorphismTest test = new PolymorphismTest(); // PolymorphismTest Ŭ������ ���ǵ� calculatePrice�� ����ϱ� ���� instance

		Customer C = new Customer(1010, "CC");
		WhiteCustomer W = new WhiteCustomer(1011, "CW");
		BlackCustomer B = new BlackCustomer(1012, "CB");

		test.calculatePrice(C); //calculatePrice()�޼����� �Ű����� customer�� ���������� Customer�̹Ƿ�, W�� B��ü�� Up-casting�Ǵ� ��Ȳ��
		test.calculatePrice(W);
		test.calculatePrice(B);
	}

	public void calculatePrice(Customer customer) { 
		System.out.println(customer.getCustomerName() + "���� ������ �ݾ��� " + customer.calcPrice(10000) + "�Դϴ�.");
		// �� ��޺� �������� ����Ǿ� �־� �������̵��� �Լ��� ȣ��Ǿ����� �� �� ����.
		// ���� �ڵ�� �������̵� ������ Ȱ���Ͽ� ��ü�� ���� ���� �ٸ� ����� ���� => �������� ������ ������
	}
}
