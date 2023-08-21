package com.application.cvirms.dto;

import jakarta.persistence.*;


import java.util.List;



@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "m_id")
	private Integer id;
	private String owner;
	@Enumerated(EnumType.STRING)
	private AccountType type;

	private String address;
	@OneToOne
	private Location location;
	private Long contact;
	private Long alternateContact;
	private String email;
	private String userName;
	private String password;
	@Enumerated(EnumType.STRING)
	private Status status;
	@OneToOne
	private Document document;

	@OneToMany
	private List<Entry> entries;

	public Member() {

	}

	


}
