package com.application.cvirms.dto;

import jakarta.persistence.*;
import java.util.List;



@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer memberId;
	private String ownerName;
	private String mwmberName;
	private String location;
	private Integer pincode;
	private Long contactPhone;
	private Long mobileNoLong;
	private String email;
	private String userName;
	private String password;
	private String status;
	private String type;
	@OneToMany
	private List<Entry> Entry;

	public Member() {
		super();
	}

	
	public String getType() {
		return type;
	}

	

	public void setType(String type) {
		this.type = type;
	}


	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getMwmberName() {
		return mwmberName;
	}

	public void setMwmberName(String mwmberName) {
		this.mwmberName = mwmberName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public Long getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(Long contactPhone) {
		this.contactPhone = contactPhone;
	}

	public Long getMobileNoLong() {
		return mobileNoLong;
	}

	public void setMobileNoLong(Long mobileNoLong) {
		this.mobileNoLong = mobileNoLong;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Entry> getEntry() {
		return Entry;
	}

	public void setEntry(List<Entry> entry) {
		Entry = entry;
	}

}
