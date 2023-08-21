package com.application.cvirms.dto;
//Created by Akash Tripathi

import jakarta.persistence.*;


@Entity
public class Visitor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "visitor_id")
	private Integer id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String email;
	private Long contact;
	private String address;
	private Location location;
	@OneToOne
	private Document document;
	private String vehicleNumber;

	@OneToMany
	private Entry entry;
	public Visitor() {
		super();
	}



}
