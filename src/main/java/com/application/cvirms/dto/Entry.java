package com.application.cvirms.dto;

//created by Akash Tripathi
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;


@Entity
public class Entry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "entry_id")
	private Integer id;
	@ManyToOne
	private Member member;
	@ManyToOne
	private Visitor visitor;
	private LocalDateTime check_in;
	private LocalDateTime check_out;
	@OneToMany
	private List<Guest> guests;
	private List<String> remark;



}
