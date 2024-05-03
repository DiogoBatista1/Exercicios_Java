package Entities;

public class Products {
	private String names;
	private double value;
	private int quantity;
	
	
	public Products(String names, double value, int quantity) {
		this.names = names;
		this.value = value;
		this.quantity = quantity;
	}


	public String getNames() {
		return names;
	}


	public void setNames(String names) {
		this.names = names;
	}


	public double getValue() {
		return value;
	}


	public void setValue(double value) {
		this.value = value;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double total() {
		return quantity * value;
	}
}
