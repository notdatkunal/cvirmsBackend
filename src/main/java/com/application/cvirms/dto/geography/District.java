package com.application.cvirms.dto.geography;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class District {
    @Id
    Integer id;
    String name;
    @ManyToOne
    State state;
    @OneToMany
    List<Taluka> talukas;

}
