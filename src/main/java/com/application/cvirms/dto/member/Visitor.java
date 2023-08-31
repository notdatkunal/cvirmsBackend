package com.application.cvirms.dto.member;
//Created by Akash Tripathi

import com.application.cvirms.dto.geography.Location;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class Visitor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "visitor_id")
	private Integer visitorId;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String middleName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String gender;
	@Column(nullable = false,unique = true)
	private String email;
	@Column(nullable = false,unique = true)
	private Long contact;
	@Column(nullable = false)
	private String address;
	@OneToOne
	private Location location;
	@OneToOne
	private Document document;
	private String vehicleNumber;

	@OneToMany
	private List<Entry> entries;

}
