package com.application.cvirms.dto.member;

import com.application.cvirms.dto.geography.Location;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor

public class Visitor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String middleName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String gender;
//	@Column(nullable = false,unique = true)
	private String email;
//	@Column(nullable = false,unique = true)
	@Column(nullable = false)
	private Long contact;
	@Column(nullable = false)
	private String address;
	@ManyToOne
	private Location location;
	@OneToOne
	private Document document;
	private String vehicleNumber;
//	@OneToMany(mappedBy = "visitor")
//	@JsonIgnoreProperties
//	@JsonIgnore
//	private List<Entry> entries;

}
