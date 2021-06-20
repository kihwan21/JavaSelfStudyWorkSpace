package customer;

public class BlackCustomer extends Customer {
	private int agentID;
	private int freeParking;
	int freeCoffee;
	private double discountRate;

	public BlackCustomer() {
		customerGrade = "Black";
		bonusRate = 0.1;
		discountRate = 0.2;
		this.agentID = 99;
		freeParking = 20;
		freeCoffee = 50;
	}
	public BlackCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		bonusRate = 0.1;
		discountRate = 0.2;
		this.agentID = agentID;
		freeParking = 20;
		freeCoffee = 50;
	}
	public BlackCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "Black";
		bonusRate = 0.1;
		discountRate = 0.2;
		this.agentID = 99;
		freeParking = 20;
		freeCoffee = 50;
	}
	// Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRate;
		price = price - (int) (price * discountRate);
		return price;
	}

	public String showCustomerInfo() {
		return customerName + "(ID:" + customerID + ")" + " " + customerGrade + ", Bobus Point: " + bonusPoint
				+ ", Agent ID: " + agentID + ", Free Parking : " + freeParking + "ȸ  Free Coffee : " + freeCoffee + "��";
	}

	public String spendFreeParking() {
		freeParking = freeParking - 1;
		if (freeParking >= 0) {			
			return customerID + "������ �������������� ����Ͽ����ϴ�. ���� �������� �ϼ��� " + freeParking + "ȸ �Դϴ�.";
		} else
			return customerID + "������ �������������� ��� ����Ͽ����ϴ�. ��������� �غ��� �ּ���.";
	}
	public String spendFreeCoffee(int freeCoffee) {
		this.freeCoffee = this.freeCoffee - freeCoffee;
		if (this.freeCoffee >= 0) {			
			return customerID + "������ ����Ŀ�������� " + freeCoffee + "�� ����Ͽ���, ���� ������ " + this.freeCoffee + "�� �Դϴ�.";
		} else {
			return customerID + "������ ����Ŀ�������� ��� ����Ͽ��ų� �����մϴ�. ���� ���� ������ Ȯ���� �ּ���. �����մϴ�..";
		}
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public int getFreeCoffee() {
		return freeCoffee;
	}

	public void setFreeCoffee(int freeCoffee) {
		this.freeCoffee = freeCoffee;
	}
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public int getFreeParking() {
		return freeParking;
	}

	public void setFreeParking(int freeParking) {
		this.freeParking = freeParking;
	}
}

