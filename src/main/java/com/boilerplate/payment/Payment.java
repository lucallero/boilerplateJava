package com.boilerplate.payment;

import java.util.UUID;

public class Payment {

    String id;
    double amount;
    String currency;
    String source;
    String destination;
    String description;

    Payment(Payment p) {
        id = UUID.randomUUID().toString();
        amount = p.amount;
        source = p.source;
        destination = p.destination;
    }

    Payment(double aAmount, String aCurrency, String aSource, String aDestination, String aDescription) {
        id = UUID.randomUUID().toString();
        amount = aAmount;
        currency = aCurrency;
        source = aSource;
        destination = aDestination;
        description = aDestination;
    }

    @Override
    public String toString() {
        return "Amount:" + amount + " Source:" + source + " Destination:" + destination + " Id:" + id;
    }
}