package Entities;

public class OutsourcedEmployee extends Employee {
	private double aditionalCharge;

	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, int hours, Double valuePerHour, Double aditionalCharge) {
		super(name, hours, valuePerHour);
		this.aditionalCharge = aditionalCharge;
	}

	public double getAditionalCharge() {
		return aditionalCharge;
	}

	public void setAditionalCharge(double aditionalCharge) {
		this.aditionalCharge = aditionalCharge;
	}
	
	public double payment() {
		return super.payment() + aditionalCharge + 1.1;
	}
}
