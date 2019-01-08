package com.dmigus.portfolio.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dmigus.portfolio.models.Email;
import com.dmigus.portfolio.models.Job;
import com.dmigus.portfolio.models.Project;
import com.dmigus.portfolio.models.User;
import com.dmigus.portfolio.repositories.JobRepository;
import com.dmigus.portfolio.repositories.ProjectRepository;
import com.dmigus.portfolio.repositories.UserRepository;
import com.dmigus.portfolio.services.EmailSender;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class DataController {
	private JobRepository jobRepository;
	private ProjectRepository projectRepository;
	private UserRepository userRepository;
	private EmailSender emailSender;
	public DataController(JobRepository jobRepository, ProjectRepository projectRepository,
			UserRepository userRepository,EmailSender emailSender) {
		super();
		this.jobRepository = jobRepository;
		this.projectRepository = projectRepository;
		this.userRepository = userRepository;
	}

	@RequestMapping("jobs")
	public List<Job> joblist() {
		return jobRepository.findAll();
	}

	@GetMapping("projects")
	public List<Project> projectsList() {
		return projectRepository.findAll();

	}

	@RequestMapping("users")
	public List<User> usersList() {
		return userRepository.findAll();
	}

	@GetMapping("addproject")
	public void addproject() {
		Project proj1 = new Project();
		proj1.setProjectName("dads");
		proj1.setGithubLink("ada.asd.asd");
		proj1.setProjDescription("qwerwrfw");
		projectRepository.save(proj1);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("project")

	public Project create(@RequestBody Project project) {
		projectRepository.save(project);
		return null;
	}

	@GetMapping(path = { "project/{id}" })
	@CrossOrigin(origins = "http://localhost:4200")
	public Optional<Project> findOne(@PathVariable("id") int id) {
		return projectRepository.findById(id);
	}

	@DeleteMapping(path = { "project/{id}" })
	public Project delete(@PathVariable("id") int id) {

		projectRepository.deleteById(id);
		return null;

	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("job")

	public Job create(@RequestBody Job job) {
		jobRepository.save(job);

		return null;
	}

	@GetMapping(path = { "job/{id}" })
	@CrossOrigin(origins = "http://localhost:4200")
	public Optional<Job> findOneJob(@PathVariable("id") int id) {
		return jobRepository.findById(id);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping(path = { "job/{id}" })
	public Job deleteJob(@PathVariable("id") int id) {

		jobRepository.deleteById(id);
		return null;

	}
	
	@GetMapping(path = { "contact-me" })
	@CrossOrigin(origins = "http://localhost:4200")
	public Optional<Email> sendEmail(@RequestBody Email email) {
		emailSender.sendEmail("schroniskoswietyspokoj@gmail.com",email.getSubject(),email.getMessage(),email.getSender());
	return null;
	}
}
