package com.dmigus.portfolio.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmigus.portfolio.models.Job;
import com.dmigus.portfolio.models.Project;
import com.dmigus.portfolio.models.User;
import com.dmigus.portfolio.repositories.JobRepository;
import com.dmigus.portfolio.repositories.ProjectRepository;
import com.dmigus.portfolio.repositories.UserRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DataController {
private JobRepository jobRepository;
private ProjectRepository projectRepository;
private UserRepository userRepository;

public DataController(JobRepository jobRepository, ProjectRepository projectRepository,
		UserRepository userRepository) {
	super();
	this.jobRepository = jobRepository;
	this.projectRepository = projectRepository;
	this.userRepository = userRepository;
}



@RequestMapping("jobs")
public List<Job> joblist(){
	return jobRepository.findAll();
}
@RequestMapping("projects")
public List<Project> projectsList(){
return projectRepository.findAll();

}
@RequestMapping("users")
public List<User> usersList(){
	return userRepository.findAll();
}
	@PostMapping("addproject")
	public void addproject() {
		Project proj1= new Project();
		proj1.setProjectName("dads");
		proj1.setGithubLink("ada.asd.asd");
		proj1.setProjDescription("qwerwrfw");
		projectRepository.save(proj1);
	}
}

