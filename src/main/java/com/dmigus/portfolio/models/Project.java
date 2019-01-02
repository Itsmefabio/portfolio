package com.dmigus.portfolio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name="projects")
@CrossOrigin(origins = "http://localhost:4200")
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="projects_Id")
private int projId;
	@Column(name="project_Name")
	private String projectName;
	@Column(name="github_Link")
	private String githubLink;
	@Column(name="proj_Description")
	private String projDescription;
	public int getProjId() {
		return projId;
	}
	public void setProjId(int projId) {
		this.projId = projId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getGithubLink() {
		return githubLink;
	}
	public void setGithubLink(String githubLink) {
		this.githubLink = githubLink;
	}
	public String getProjDescription() {
		return projDescription;
	}
	public void setProjDescription(String projDescription) {
		this.projDescription = projDescription;
	}
	
	@Override
	public String toString() {
		return "Project [projId=" + projId + ", projectName=" + projectName + ", githubLink=" + githubLink
				+ ", projDescription=" + projDescription + "]";
	}

	
}
