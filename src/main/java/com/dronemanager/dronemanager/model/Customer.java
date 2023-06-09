package com.dronemanager.dronemanager.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "customer")
@Data
public class Customer {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String customerName;

    private String email;

    private long phoneNumber;

    private String country;

    private Date createdDate;

    private Date updateDate;

    public void onSave() {
        if(id != 0) {
            setUpdateDate(new Date());
        } else {
            setCreatedDate(new Date());
        }
    }
}