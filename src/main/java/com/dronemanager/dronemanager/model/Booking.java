package com.dronemanager.dronemanager.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "booking")
@Data
public class Booking {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Customer customer;

    private int locationId;

    private int droneId;

    private Date bookedDate;

    private Date bookedSlot;

    public void onSave() {
        setBookedDate(new Date());
    }

}
