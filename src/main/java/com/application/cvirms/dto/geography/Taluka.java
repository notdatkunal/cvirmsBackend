package com.application.cvirms.dto.geography;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Taluka {
    @Id
    Integer id;
    String name;
    @ManyToOne
    District district;
    @OneToMany
    List<Location> locations;
}
