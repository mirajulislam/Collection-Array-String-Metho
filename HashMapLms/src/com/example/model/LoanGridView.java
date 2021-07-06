package com.example.model;

import java.util.Date;

public class LoanGridView {

	private String loanTrackingId;
	private String stateName;
	private Date dttMod;
	private String name;
	private String phone;	
	
	public LoanGridView() {
		super();
	}
	public LoanGridView(String loanTrackingId, String stateName, Date dttMod, String name, String phone) {
		super();
		this.loanTrackingId = loanTrackingId;
		this.stateName = stateName;
		this.dttMod = dttMod;
		this.name = name;
		this.phone = phone;
	}
	public String getLoanTrackingId() {
		return loanTrackingId;
	}
	public void setLoanTrackingId(String loanTrackingId) {
		this.loanTrackingId = loanTrackingId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Date getDttMod() {
		return dttMod;
	}
	public void setDttMod(Date dttMod) {
		this.dttMod = dttMod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "LoanGridView [loanTrackingId=" + loanTrackingId + ", stateName=" + stateName + ", dttMod=" + dttMod
				+ ", name=" + name + ", phone=" + phone + "]";
	}
	
	
}
