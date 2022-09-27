package com.lucianobrito.hrpayroll.resources;

import com.lucianobrito.hrpayroll.entities.Payment;
import com.lucianobrito.hrpayroll.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

    @Autowired
    private PaymentService service;

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> findPaymentBy(
            @PathVariable("workerId") Long workerId,
            @PathVariable("days") Integer days) {
        Payment payment = service.getPayment(workerId, days);
        return  ResponseEntity.ok(payment);
    }
}
