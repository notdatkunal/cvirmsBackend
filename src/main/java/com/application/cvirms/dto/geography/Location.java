package com.application.cvirms.dto.geography;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class    Location {

    @Id
    private Integer pincode;
    private String address;
    @ManyToOne
    private Taluka taluka;
    private String region;


}
