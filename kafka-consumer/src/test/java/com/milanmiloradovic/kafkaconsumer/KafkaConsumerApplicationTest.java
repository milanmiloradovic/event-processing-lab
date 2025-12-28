package com.milanmiloradovic.kafkaconsumer;

import com.milanmiloradovic.kafkaconsumer.util.properties.KafkaConsumerPropertiesTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@EnableConfigurationProperties({
        KafkaConsumerPropertiesTest.class
})
class KafkaConsumerApplicationTest {

    @Autowired
    private KafkaConsumerPropertiesTest kafkaConsumerProperties;

    @Test
    void contextLoads() {
        assertThat(kafkaConsumerProperties).isNotNull();
    }

}
