package com.application.cvirms.dto.member;

import com.application.cvirms.dto.geography.Location;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.util.List;



@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	@Column(nullable = false)
	@NotNull
	private String firstName;
	@NotNull
	@Column(nullable = false)
	private String middleName;
	@NotNull
	@Column(nullable = false)
	private String lastName;

	@Enumerated(EnumType.STRING)
	private AccountType type;
	@NotNull
	private String address;
	@OneToOne
	@NotNull
	private Location location;
	@NotNull
	@Column(unique = true,nullable = false)
	private Long contact;
	private Long alternateContact;
	@Column(nullable = false)
	@NotNull
	private String email;
	@Column(nullable = false,unique = true)
	@NotNull
	private String userName;
	@Column(nullable = false)
	@NotNull
	private String password;
	@Enumerated(EnumType.STRING)
	private Status status=Status.INACTIVE;
	@OneToOne
	private Document document;


//	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "member")
//	private List<Entry> entries;




}
