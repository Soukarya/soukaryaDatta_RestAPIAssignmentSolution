package com.greatlearning.springboot.employeemanagement.service;

import java.util.List;

import com.greatlearning.springboot.employeemanagement.entity.Role;
import com.greatlearning.springboot.employeemanagement.entity.User;

public interface CredentialService {

	Role addRole(String role);
	User addUser(String userName, String password, String role_name);
	List<Role> listAllRoles();
}
