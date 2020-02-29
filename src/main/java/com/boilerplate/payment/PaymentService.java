package com.boilerplate.payment;

public class PaymentService {

    Payment payment = getPayment();

    public Payment getPayment() {
        return new Payment(2.31, "Alice", "Bob");
    }

    public boolean liquidate(Payment p) {
        return true;
    }

    public void updatePaymentAmount(double amount) {
        payment.amount = amount;
    }
}