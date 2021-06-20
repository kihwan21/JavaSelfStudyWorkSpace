package customer;

public class WhiteCustomer extends Customer {
	int agentID = 9;
	private double discountRate;

	public WhiteCustomer() {
		customerGrade = "White";
		bonusRate = 0.05;
		discountRate = 0.1;
	}

	public WhiteCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "White";
		bonusRate = 0.05;
		discountRate = 0.1;
		// System.out.println(" WhiteCustomer Constructor( , ) Call");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRate;
		price = price - (int) (price * discountRate);
		return price;
	}

	public String showCustomerInfo() {
		return customerName + "(ID:" + customerID + ")" + " " + customerGrade + ", Bobus Point: " + bonusPoint
				+ ", Agent ID: " + agentID;
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}

//持失切 拙失
/*
 * public class WhiteCustomer extends Customer{ private int agentID; private
 * double discountRate;
 * 
 * public WhiteCustomer() { customerGrade = "White"; bonusRate = 0.05;
 * System.out.println("   WhiteCustomer Constructor() Call"); }
 * 
 * public WhiteCustomer(int customerID, String customerName) { super(customerID,
 * customerName); customerGrade = "White"; bonusRate = 0.05;
 * System.out.println("   WhiteCustomer Constructor( , ) Call"); }
 * 
 * public int getAgentID() { return agentID; } }
 * 
 */

