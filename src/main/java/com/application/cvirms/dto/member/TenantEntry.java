//package com.application.cvirms.dto.member;
//
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.ManyToOne;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Entity
//@Data
//@NoArgsConstructor
//public class TenantEntry extends Entry{
//    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    @JsonIgnore
//    private Tenant member;
//    private LocalDate checkIn;
//    private LocalDate checkOut;
//    private List<Guest> guests;
//
//}
