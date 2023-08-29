package com.application.cvirms.dto.member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Document {
    @Id
    private Integer id;
    private String number;
    @Column(name = "document_name")
    private String name;
    private byte[] document;
    private String type;


}
