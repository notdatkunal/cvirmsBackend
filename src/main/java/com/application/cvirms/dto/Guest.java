package com.application.cvirms.dto;

import jakarta.persistence.*;



@Entity
public class Guest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "g_id")
	private Integer id;
	@Column(name = "g_name")
	private String name;
	@ManyToOne
	private Entry entry;
	


}
