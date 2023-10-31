package com.application.cvirms.dto.member;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
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


    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonBackReference
    private Hotel member;

    private LocalDateTime checkIn;

    private LocalDateTime checkOut;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Guest> guests;
}
