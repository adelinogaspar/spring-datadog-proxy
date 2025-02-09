package com.gaspar.kafka_test.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class PaymentEvent {
    private String id;
    private BigDecimal amount;
    private LocalDateTime date;
}
