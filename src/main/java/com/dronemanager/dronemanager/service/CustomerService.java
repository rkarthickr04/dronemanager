package com.dronemanager.dronemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dronemanager.dronemanager.model.Customer;
import com.dronemanager.dronemanager.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired CustomerRepository customerRepository;
    
    public Customer saveOrUpdateCustomer(Customer customer) {
        customer.onSave();
        return customerRepository.save(customer);
    }
}
