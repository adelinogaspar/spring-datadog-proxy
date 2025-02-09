package com.gaspar.kafka_test.config;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AppConfig {
    @Value("${management.datadog.metrics.export.api-key}")
    private String apiKey;

    @PostConstruct
    public void init() {
        log.info("API Key: {}", apiKey);  // ✅ Will print the correct value
    }
}
