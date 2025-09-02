package org.example.service_one.Client;

import org.example.service_one.Dao.ResponseTwoDao;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "servicetwo" , url = "http://localhost:8080")
public interface ServiceOneClient {

    @PostMapping("/lastName")
    ResponseTwoDao getlastName();
}
