package com.greatlearning.springboot.employeemanagement.controller;

import java.util.List;

import com.greatlearning.springboot.employeemanagement.entity.Role;
import com.greatlearning.springboot.employeemanagement.entity.User;
import com.greatlearning.springboot.employeemanagement.service.CredentialService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signup")
public class CredentialsController {

	@Autowired
	private CredentialService credentialService;

	@PostMapping("/addrole")
	public Role addRole(String name) {
		return credentialService.addRole(name);
	}

	@RequestMapping("/adduser")
	public User addUser(String username, String password, String role_name) {
		return credentialService.addUser(username, password, role_name);
	}

	@GetMapping("/listroles")
	public List<Role> listRoles() {
		return credentialService.listAllRoles();
	}
}
