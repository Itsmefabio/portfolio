package com.dmigus.portfolio.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ViewsController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping({ "/", "index" })
	public String index() {
		logger.info("redirecting to index");
		return "index";

	}

	@RequestMapping("about-me")
	public String aboutMe() {
		logger.info("redirecting to about-me");
		return "about-me";
	}

	@RequestMapping("job-experience")
	public String jobExperience() {
		logger.info("redirecting to job-experience");
		return "job-experience";

	}

	@RequestMapping("contact")
	public String contact() {
		logger.info("redirecting to contact");
		return "contact";
	}

	public String projects() {
		logger.info("redirecting to projects");
		return "projects";
	}
}
