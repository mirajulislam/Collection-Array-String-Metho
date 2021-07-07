package com.example.model;

import java.util.Date;

public class Report {

	private String stateName;
	private Date creationDate;
	private Date recommendedDate;
	private Date receivedDate;
	private Date approvedDate;
	private Date selGenerateDate;
	private Date disbursedDate;
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getRecommendedDate() {
		return recommendedDate;
	}
	public void setRecommendedDate(Date recommendedDate) {
		this.recommendedDate = recommendedDate;
	}
	public Date getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}
	public Date getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}
	public Date getSelGenerateDate() {
		return selGenerateDate;
	}
	public void setSelGenerateDate(Date selGenerateDate) {
		this.selGenerateDate = selGenerateDate;
	}
	public Date getDisbursedDate() {
		return disbursedDate;
	}
	public void setDisbursedDate(Date disbursedDate) {
		this.disbursedDate = disbursedDate;
	}
	@Override
	public String toString() {
		return "Report [stateName=" + stateName + ", creationDate=" + creationDate + ", recommendedDate="
				+ recommendedDate + ", receivedDate=" + receivedDate + ", approvedDate=" + approvedDate
				+ ", selGenerateDate=" + selGenerateDate + ", disbursedDate=" + disbursedDate + "]";
	}
		
	
}
