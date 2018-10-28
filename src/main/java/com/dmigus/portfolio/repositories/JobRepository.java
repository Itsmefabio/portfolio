package com.dmigus.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmigus.portfolio.models.Job;

public interface JobRepository extends JpaRepository<Job,Integer>{

}
