package org.example.servicetwo.controller;

import org.example.servicetwo.Dao.ResponseDao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTwoController {

    @PostMapping("/lastName")
    public ResponseEntity<ResponseDao> lastName(){
        return ResponseEntity.ok(new ResponseDao("Singh"));
    }
}
