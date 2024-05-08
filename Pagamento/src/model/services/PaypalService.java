package model.services;

public class PaypalService implements OnlinePaymentService {


	@Override
	public double interest(double amount, double months) {
		double interestRate = 0.01;
		return amount + (amount * interestRate * months);
	}
	
	@Override
	public double paymentFee(Double amount) {
		double paymentRate = 0.02;
		return amount + (amount * paymentRate);
	}
}
