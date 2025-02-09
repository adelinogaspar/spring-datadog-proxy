package com.gaspar.kafka_test.controller;

import com.gaspar.kafka_test.controller.dto.PaymentResponse;
import datadog.trace.api.Trace;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RestController
public class TestController {

    @GetMapping("/payment")
    @Trace(operationName = "payment.request")
    public PaymentResponse getPaymentResponse() {
        return  PaymentResponse.builder()
                .id("1222")
                .amount(new BigDecimal("123.99"))
                .date(LocalDateTime.now())
                .build();
    }
}
