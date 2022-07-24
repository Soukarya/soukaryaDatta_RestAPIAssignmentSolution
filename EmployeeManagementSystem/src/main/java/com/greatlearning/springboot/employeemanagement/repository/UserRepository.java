package com.greatlearning.springboot.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.greatlearning.springboot.employeemanagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

		User getUserByUsername(String username);
}
