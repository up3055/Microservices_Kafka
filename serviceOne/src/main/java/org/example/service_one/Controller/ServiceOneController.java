package org.example.service_one.Controller;

import org.example.service_one.Dao.ResponseDao;
import org.example.service_one.service.KafkaProducer;
import org.example.service_one.service.ServiceOneTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

    private final ServiceOneTwo serviceOneTwo;
    private final KafkaProducer kafkaProducer;
    @Autowired
    public ServiceOneController (ServiceOneTwo serviceOneTwo , KafkaProducer kafkaProducer){
        this.serviceOneTwo = serviceOneTwo;
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/First_Name")
    public ResponseEntity<ResponseDao>  getFirstName(){
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<ResponseTwoDao> response = restTemplate.postForEntity(
//                "http://localhost:8080/lastName", null, ResponseTwoDao.class);
//       ResponseTwoDao r1 = response.getBody();
//     System.out.println(r1.getLastName());

      this.kafkaProducer.sendMessage("Hi Message sent successfully");

      return ResponseEntity.ok(new ResponseDao("upmanyu" + this.serviceOneTwo.lastName()));
    }
}
