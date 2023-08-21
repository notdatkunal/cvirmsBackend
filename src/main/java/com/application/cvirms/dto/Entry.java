package com.application.cvirms.dto;

//created by Akash Tripathi
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;


@Entity
public class Entry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer entry_Id;
	private String member;
	private Integer visitor;
	private LocalDateTime check_in;
	private LocalDateTime check_out;
	private String remark;

	@OneToMany
	private List<Entry> Entry;

	public Entry() {
		super();
	}

	public Integer getEntry_Id() {
		return entry_Id;
	}

	public void setEntry_Id(Integer entry_Id) {
		this.entry_Id = entry_Id;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public Integer getVisitor() {
		return visitor;
	}

	public void setVisitor(Integer visitor) {
		this.visitor = visitor;
	}

	public LocalDateTime getCheck_in() {
		return check_in;
	}

	public void setCheck_in(LocalDateTime check_in) {
		this.check_in = check_in;
	}

	public LocalDateTime getCheck_out() {
		return check_out;
	}

	public void setCheck_out(LocalDateTime check_out) {
		this.check_out = check_out;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
