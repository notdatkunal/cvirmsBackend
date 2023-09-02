package com.application.cvirms.dto.member;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class HotelEntry extends Entry{




    private LocalDate checkIn;

    private LocalDate checkOut;
    @OneToMany
    private List<Guest> guests;
}
