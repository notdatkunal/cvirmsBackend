package com.application.cvirms.dto.geography;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;
    @Column(unique = true,nullable = false)
    String name;
    @OneToMany
    List<District> districts;
}
