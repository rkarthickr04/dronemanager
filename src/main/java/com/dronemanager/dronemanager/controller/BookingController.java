package com.dronemanager.dronemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dronemanager.dronemanager.common.ResponseObject;
import com.dronemanager.dronemanager.model.Booking;
import com.dronemanager.dronemanager.service.BookingService;

@RestController
//@CrossOrigin(maxAge = 3600)
@RequestMapping("/booking")
public class BookingController {
    @Autowired BookingService bookingService;
    
    @PostMapping("/save")
    public ResponseObject saveCustomer(@RequestBody Booking booking) {
        return new ResponseObject("success", bookingService.saveOrUpdateBooking(booking));
    }

   // @CrossOrigin(origins = "http://192.168.0.108:4200")
    @GetMapping("/all")
    public ResponseObject getAllBookings() {
        return new ResponseObject("success", bookingService.getAllBookings());
    }

    @PostMapping("/delete")
    public ResponseObject deleteBooking(@RequestParam int id) {
        bookingService.deleteBooking(id);
        return new ResponseObject("success");
    }
}
