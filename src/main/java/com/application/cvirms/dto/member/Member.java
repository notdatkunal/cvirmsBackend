package com.application.cvirms.dto.member;

import com.application.cvirms.dto.geography.Location;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;



@Entity
@Data
@NoArgsConstructor
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "m_id")
	private Integer id;
	@Column(nullable = false)
	private String owner;

	@Enumerated(EnumType.STRING)
	private AccountType type;

	private String address;
	@OneToOne
	private Location location;
	private Long contact;
	private Long alternateContact;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String userName;
	@Column(nullable = false)
	private String password;
	@Enumerated(EnumType.STRING)
	private Status status;
	@OneToOne
	private Document document;


	@OneToMany
	private List<Entry> entries;


}
