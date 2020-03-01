package com.boilerplate.payment;

import java.util.Collection;
import java.util.HashMap;

import com.boilerplate.exceptions.NotFoundException;

public class PaymentService {

    static HashMap<String, Payment> paymentsMap = new HashMap<>();
    static {
        Payment p1 = new Payment(2.35, "Alice", "Bob");
        Payment p2 = new Payment(3.45, "Bob", "Alice");
        paymentsMap.put(p1.id, p1);
        paymentsMap.put(p2.id, p2);
    }

    Payment createPayment(Payment p) {
        return p;
    }

    Collection<Payment> listPayments() {
        return paymentsMap.values();
    }

    Payment getPayment(String id) {
        if (!paymentsMap.containsKey(id)) {
            throw new NotFoundException("No payment found with ID " + id);
        }
        return paymentsMap.get(id);
    }

    public boolean liquidate(Payment p) {
        return true;
    }
}