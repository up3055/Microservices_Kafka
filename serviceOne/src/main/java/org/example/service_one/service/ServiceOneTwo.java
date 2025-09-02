package org.example.service_one.service;

import org.example.service_one.Client.ServiceOneClient;
import org.example.service_one.Dao.ResponseTwoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceOneTwo {

    private final ServiceOneClient serviceOneClient;

    @Autowired
    public ServiceOneTwo(ServiceOneClient serviceOneClient){
        this.serviceOneClient = serviceOneClient;
    }

    public ResponseTwoDao lastName(){
        return this.serviceOneClient.getlastName();
    }
}
