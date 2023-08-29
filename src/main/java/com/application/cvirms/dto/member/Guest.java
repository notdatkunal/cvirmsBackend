package com.application.cvirms.dto.member;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
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
