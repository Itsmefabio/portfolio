package com.dmigus.portfolio.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobs")
public class Job {
	@Id
	@Column(name = "jobs_Id")
	private int jobId;
	@Column(name = "company_Name")
	private String companyName;
	@Column(name = "position")
	private String postion;
	@Column(name = "from")
	private Date from;
	@Column(name = "to")
	private Date to;
	@Column(name = "duties")
	private String duties;

	public int getJobsId() {
		return jobId;
	}

	public void setJobsId(int jobId) {
		this.jobId = jobId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPostion() {
		return postion;
	}

	public void setPostion(String postion) {
		this.postion = postion;
	}

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}

	public String getDuties() {
		return duties;
	}

	public void setDuties(String duties) {
		this.duties = duties;
	}

	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", companyName=" + companyName + ", postion=" + postion + ", from=" + from
				+ ", to=" + to + ", duties=" + duties + "]";
	}

}
