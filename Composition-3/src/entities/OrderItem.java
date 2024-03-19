package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	public OrderItem(Integer quantity, Double price) {
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public double subTotal() {
		return quantity * price;
	}
}
