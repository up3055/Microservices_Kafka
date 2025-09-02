package org.example.service_one.Controller;

import org.example.service_one.Dao.ResponseDao;
import org.example.service_one.service.ServiceOneTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

    private final ServiceOneTwo serviceOneTwo;

    @Autowired
    public ServiceOneController (ServiceOneTwo serviceOneTwo){
        this.serviceOneTwo = serviceOneTwo;
    }

    @PostMapping("/First_Name")
    public ResponseEntity<ResponseDao>  getFirstName(){
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<ResponseTwoDao> response = restTemplate.postForEntity(
//                "http://localhost:8080/lastName", null, ResponseTwoDao.class);
//       ResponseTwoDao r1 = response.getBody();
//     System.out.println(r1.getLastName());



      return ResponseEntity.ok(new ResponseDao("upmanyu" + this.serviceOneTwo.lastName()));
    }
}
