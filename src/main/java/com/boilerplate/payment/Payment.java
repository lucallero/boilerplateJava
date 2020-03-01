package com.boilerplate.payment;

import java.util.UUID;

public class Payment {

    String id;
    double amount;
    String source;
    String destination;

    Payment(Payment p) {
        id = UUID.randomUUID().toString();
        amount = p.amount;
        source = p.source;
        destination = p.destination;
    }

    Payment(double a, String s, String d) {
        id = UUID.randomUUID().toString();
        amount = a;
        source = s;
        destination = d;
    }

    @Override
    public String toString() {
        return "Amount:" + amount + " Source:" + source + " Destination:" + destination + " Id:" + id;
    }
}