package com.dronemanager.dronemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dronemanager.dronemanager.common.ResponseObject;
import com.dronemanager.dronemanager.model.Customer;
import com.dronemanager.dronemanager.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired CustomerService customerService;
    
    @PostMapping("/save")
    public ResponseObject saveCustomer(@RequestBody Customer customer) {
        return new ResponseObject("success", customerService.saveOrUpdateCustomer(customer));
    }
}
