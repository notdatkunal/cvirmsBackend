package com.application.cvirms.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Document {
    @Id
    private String number;
    @Column(name = "document_name")
    private String name;
    private byte[] document;
    private String type;

}
