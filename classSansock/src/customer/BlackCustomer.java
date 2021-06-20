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
				+ ", Agent ID: " + agentID + ", Free Parking : " + freeParking + "회  Free Coffee : " + freeCoffee + "매";
	}

	public String spendFreeParking() {
		freeParking = freeParking - 1;
		if (freeParking >= 0) {			
			return customerID + "고객님의 무료주차쿠폰을 사용하였습니다. 남은 무료주차 일수는 " + freeParking + "회 입니다.";
		} else
			return customerID + "고객님의 무료주차쿠폰을 모두 사용하였습니다. 주차요금을 준비해 주세요.";
	}
	public String spendFreeCoffee(int freeCoffee) {
		this.freeCoffee = this.freeCoffee - freeCoffee;
		if (this.freeCoffee >= 0) {			
			return customerID + "고객님의 무료커피쿠폰을 " + freeCoffee + "개 사용하였고, 남은 쿠폰은 " + this.freeCoffee + "개 입니다.";
		} else {
			return customerID + "고객님의 무료커피쿠폰을 모두 사용하였거나 부족합니다. 프리 쿠폰 갯수를 확인해 주세요. 감사합니다..";
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

