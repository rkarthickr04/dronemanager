package com.dronemanager.dronemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dronemanager.dronemanager.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
    
}
