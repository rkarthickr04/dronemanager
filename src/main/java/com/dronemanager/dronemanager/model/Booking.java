package com.dronemanager.dronemanager.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "booking")
@Data
public class Booking {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int bookingId;

    private int customerId;

    private int locationId;

    private int droneId;

    private Date bookedDate;

    private Date bookedSlot;

}
