package com.boilerplate.payment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PaymentController {

    final PaymentService paymentService = new PaymentService();

    @RequestMapping("/payments")
    String getPayment() {
        return paymentService.getPayment().toString();
    }
}