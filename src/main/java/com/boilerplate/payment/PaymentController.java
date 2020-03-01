package com.boilerplate.payment;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PaymentController {

    final PaymentService service = new PaymentService();

    @RequestMapping(value = "/payments")
    public ResponseEntity<Object> list() {
        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }

    @RequestMapping(value = "/payments/{id}")
    public ResponseEntity<Object> get(@PathVariable String id) {
        return new ResponseEntity<>(service.get(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/payments/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> update(@PathVariable String id, @RequestBody Payment payment) {
        return new ResponseEntity<>(service.update(id, payment), HttpStatus.OK);
    }

    @RequestMapping(value = "/payments", method = RequestMethod.POST)
    public ResponseEntity<Object> create(@RequestBody Payment payment) {
        return new ResponseEntity<>(service.create(payment), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/payments/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

}