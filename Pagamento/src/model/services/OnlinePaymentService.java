package model.services;

public interface OnlinePaymentService {
	double paymentFee(Double amount);
	double interest(double amount, double months);
}
