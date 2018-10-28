package com.dmigus.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmigus.portfolio.models.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
