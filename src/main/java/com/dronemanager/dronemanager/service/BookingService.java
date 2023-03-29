package com.dronemanager.dronemanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dronemanager.dronemanager.model.Booking;
import com.dronemanager.dronemanager.repository.BookingRepository;


@Service
public class BookingService {

    @Autowired BookingRepository bookingRepository;
    
    public Booking saveOrUpdateBooking(Booking booking) {
        booking.onSave();
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public void deleteBooking(int id) {
        if(bookingRepository.existsById(id)) {
            bookingRepository.deleteById(id);
        }
    }
}
