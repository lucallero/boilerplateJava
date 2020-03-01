package com.boilerplate.payment;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PaymentController {

    final PaymentService service = new PaymentService();

    @RequestMapping("/payments")
    public ResponseEntity<Object> listPayments() {
        return new ResponseEntity<>(service.listPayments(), HttpStatus.OK);
    }

    @RequestMapping("/payments/{id}")
    public ResponseEntity<Object> paymentPayments(@PathVariable String id) {
        return new ResponseEntity<>(service.getPayment(id), HttpStatus.OK);
    }
}