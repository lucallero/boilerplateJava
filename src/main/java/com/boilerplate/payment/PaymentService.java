package com.boilerplate.payment;

import java.util.Collection;
import java.util.HashMap;

import com.boilerplate.exceptions.ConflictException;
import com.boilerplate.exceptions.NotFoundException;

public class PaymentService {

    static HashMap<String, Payment> paymentsMap = new HashMap<>();
    static {
        Payment p1 = new Payment(2.35, "Alice", "Bob");
        Payment p2 = new Payment(3.45, "Bob", "Alice");
        paymentsMap.put(p1.id, p1);
        paymentsMap.put(p2.id, p2);
    }

    Collection<Payment> list() {
        return paymentsMap.values();
    }

    Payment get(String id) {
        if (!paymentsMap.containsKey(id)) {
            throw new NotFoundException("No payment found with ID " + id);
        }
        return paymentsMap.get(id);
    }

    Payment update(String id, Payment p) {
        if (!id.equals(p.id)) {
            throw new ConflictException("Path parameter ID " + id + " does not match body ID " + p.id);
        }
        if (!paymentsMap.containsKey(p.id)) {
            throw new NotFoundException("No payment found with ID " + p.id);
        }
        paymentsMap.put(p.id, p);
        return p;
    }

    Payment create(Payment p) {
        if (paymentsMap.containsKey(p.id)) {
            throw new ConflictException("Payment with ID " + p.id + " already exists");
        }
        Payment newPayment = new Payment(p);
        paymentsMap.put(newPayment.id, newPayment);
        return newPayment;
    }

    void delete(String id) {
        if (!paymentsMap.containsKey(id)) {
            throw new NotFoundException("No payment found with ID " + id);
        }
        paymentsMap.remove(id);
    }

    public boolean liquidate(Payment p) {
        return true;
    }
}