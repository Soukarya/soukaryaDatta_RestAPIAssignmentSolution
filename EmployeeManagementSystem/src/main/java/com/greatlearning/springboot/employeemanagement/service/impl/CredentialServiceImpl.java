package com.greatlearning.springboot.employeemanagement.service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.springboot.employeemanagement.entity.Role;
import com.greatlearning.springboot.employeemanagement.entity.User;
import com.greatlearning.springboot.employeemanagement.repository.RoleRepository;
import com.greatlearning.springboot.employeemanagement.repository.UserRepository;
import com.greatlearning.springboot.employeemanagement.service.CredentialService;

@Service
public class CredentialServiceImpl implements CredentialService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Role addRole(String roleName) {
		Role role = roleRepository.findRoleByName(roleName);
		if (role != null)
			return role;
		role = new Role();
		role.setName(roleName);
		return roleRepository.save(role);
	}

	@Override
	public User addUser(String userName, String password, String role_name) {
		User user = new User();
		user.setUsername(userName);
		user.setPassword(password);

		List<Role> roles = new ArrayList<>();
		Role role = roleRepository.findRoleByName(role_name);
		if (role == null) {
			role = addRole(role_name);
		}
		roles.add(role);
		user.setRoles(roles);

		return userRepository.save(user);
	}

	@Override
	public List<Role> listAllRoles() {
		return roleRepository.findAll();
	}

}