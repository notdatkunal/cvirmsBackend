package com.application.cvirms.dto.features;

import com.application.cvirms.dto.member.Document;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Flag
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flag_id")
    private  Integer flagId;

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private Long contactNo;
    private String vehicleNo;
    @ManyToOne
    private Document document;
    @Lob
    private byte[] photoId;
    @NotNull
    private String reason;
    private List<String> remark;

}