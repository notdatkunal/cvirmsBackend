package com.application.cvirms.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Location {

    @Id
    private Integer pincode;
    private String address;
    private String taluka;
    private String district;
    private String state;
    private String region;

}
