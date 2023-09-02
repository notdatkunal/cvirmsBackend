package com.application.cvirms.dto.member;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String number;
    @Column(name = "document_name")
    private String name;
    @Lob
    private byte[] document;
    private String type;


}
