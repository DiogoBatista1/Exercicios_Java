package entities;

import java.util.ArrayList;
import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	public ArrayList<OrderItem> items = new ArrayList<>();
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}


	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public ArrayList<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for(OrderItem i: items) {
			sum += i.subTotal();
		}
		return sum;
	}
}
