package customer;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;   //private 변경시 체크
	int bonusPoint;
	protected double bonusRate;

	public Customer() {
		customerGrade = "Blue";
		bonusRate = 0.01;
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "Blue";
		bonusRate = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRate;
		return price;
	}

	public String showCustomerInfo() {
		return customerName + "(ID:" + customerID + ")" + " " + customerGrade + ", Bobus Point: " + bonusPoint;
	}

//////////////////////////	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRate() {
		return bonusRate;
	}

	public void setBonusRate(double bonusRate) {
		this.bonusRate = bonusRate;
	}
}
