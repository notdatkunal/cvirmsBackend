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
	private String name;
	private String gender;
	private String managerName;
	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String middleName;

	@Column(nullable = false)
	private String lastName;

	private String profile;

	@Enumerated(EnumType.STRING)
	private AccountType type;

	private String address;
	@ManyToOne
	private Location location;

	@Column(unique = true,nullable = false)
	private Long contact;
	private Long alternateContact;
	@Column(nullable = false)

	private String email;
	@Column(nullable = false,unique = true)

	private String userName;
	@Column(nullable = false)

	private String password;
	@Enumerated(EnumType.STRING)
	private Status status=Status.INACTIVE;
	@OneToOne
	private Document document;

	@OneToMany
	private List<Employee> employees;

//	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "member")
//	private List<Entry> entries;




}
