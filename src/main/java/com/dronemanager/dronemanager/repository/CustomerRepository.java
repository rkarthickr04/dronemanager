package com.dronemanager.dronemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dronemanager.dronemanager.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,String> {
    
}
