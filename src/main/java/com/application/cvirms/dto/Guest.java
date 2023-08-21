package com.application.cvirms.dto;

import jakarta.persistence.*;



@Entity
public class Guest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer gId;
	private String gName;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Entry entry;
	

	public Guest() {
		super();
	}
	

	public Entry getEntry() {
		return entry;
	}


	public void setEntry(Entry entry) {
		this.entry = entry;
	}


	public Integer getgId() {
		return gId;
	}

	public void setgId(Integer gId) {
		this.gId = gId;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}
}
