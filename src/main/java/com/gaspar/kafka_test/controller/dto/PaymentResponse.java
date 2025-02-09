package com.gaspar.kafka_test.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class PaymentResponse {
    private String id;
    private BigDecimal amount;
    private LocalDateTime date;
}
