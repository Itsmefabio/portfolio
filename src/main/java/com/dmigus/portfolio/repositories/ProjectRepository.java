package com.dmigus.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dmigus.portfolio.models.Project;
@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface ProjectRepository extends JpaRepository<Project,Integer> {

}
