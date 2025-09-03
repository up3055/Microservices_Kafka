package org.example.servicetwo.Dao.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Micro" , groupId = "service-two-group")
    public void consume(String message){
        System.out.println("Received message to Service Two" + message );
    }
}
