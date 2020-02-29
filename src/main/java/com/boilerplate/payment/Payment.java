package com.boilerplate.payment;

public class Payment {

    double amount;
    String source;
    String destination;

    Payment(double amount, String source, String destination) {
        this.amount = amount;
        this.source = source;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Amount:" + amount + " Source:" + source + " Destination:" + destination;
    }
}