package com.application.cvirms.dto.member;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class TenantEntry extends Entry{


    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Tenancy member;

    private LocalDate checkIn;

    private LocalDate checkOut;
    @OneToMany
    private List<Guest> guests;
}
