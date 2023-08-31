package com.application.cvirms.dto.member;

//created by Akash Tripathi
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
	@Column(name = "entry_id")
	private Integer entryId;
	@ManyToOne
	private Member member;
	@ManyToOne
	private Visitor visitor;

	private List<String> remark;


}
