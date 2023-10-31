package com.application.cvirms.dto.member;

//created by Akash Tripathi
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Entry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
//	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//	@JsonIgnore
//	private Member member;
//	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private Visitor visitor;
	@Lob
	private List<String> remark;





}
