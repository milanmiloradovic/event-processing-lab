package com.milanmiloradovic.kafkaconsumer;

import com.milanmiloradovic.kafkaconsumer.util.properties.KafkaConsumerProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@EnableConfigurationProperties({
        KafkaConsumerProperties.class
})
class KafkaConsumerApplicationTest {

    @Autowired
    private KafkaConsumerProperties kafkaConsumerProperties;

    @Test
    void contextLoads() {
        assertThat(kafkaConsumerProperties).isNotNull();
    }

}
