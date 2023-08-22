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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Visitor getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitor visitor) {
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

	public List<Guest> getGuests() {
		return guests;
	}

	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}

	public List<String> getRemark() {
		return remark;
	}

	public void setRemark(List<String> remark) {
		this.remark = remark;
	}
}
