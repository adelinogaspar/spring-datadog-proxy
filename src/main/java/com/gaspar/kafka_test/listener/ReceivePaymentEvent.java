package com.gaspar.kafka_test.listener;

import com.gaspar.kafka_test.domain.PaymentEvent;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReceivePaymentEvent {

/*    @KafkaListener(
            topics = "${app.topic.name}",
            groupId = "${app.topic.group-id}"
    )*/
    public void getMessage(
            @Payload ConsumerRecord<String, PaymentEvent> event,
            @Headers MessageHeaders messageHeaders
            ) {
        log.trace("send some metrics to datadog:{}{}", System.lineSeparator(), event);
        log.info("headers='{}'", messageHeaders);
        log.info("Received Message in group: {}", event);
    }
}
