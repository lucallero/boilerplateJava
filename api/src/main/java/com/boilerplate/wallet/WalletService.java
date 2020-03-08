package com.boilerplate.wallet;

import com.boilerplate.payment.Payment;
import com.boilerplate.payment.PaymentService;

class WalletService {

    PaymentService p = new PaymentService();

    public int pay(Payment pp) {
        if (p.liquidate(pp)) {
            return 200;
        }
        return 409;
    }
}