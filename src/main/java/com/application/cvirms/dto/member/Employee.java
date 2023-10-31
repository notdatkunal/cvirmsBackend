package com.application.cvirms.dto.member;

import com.application.cvirms.dto.geography.Location;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String middleName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private Long contact;
    @Column(nullable = false)
    private String address;
    @ManyToOne
    private Location location;
    @Column(nullable = false)
    private String position;
    private String doucumentIdString;
    private String employeeIdString;

}
