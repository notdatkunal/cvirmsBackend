package com.application.cvirms.dto.member;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class HotelEntry extends Entry{

    @NotNull
    private LocalDateTime check_in;

    private LocalDateTime check_out;
    @OneToMany
    private List<Guest> guests;
}
