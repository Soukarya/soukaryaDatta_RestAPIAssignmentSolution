package com.greatlearning.springboot.employeemanagement.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort.Direction;

import com.greatlearning.springboot.employeemanagement.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	Employee findById(int id);
	void save(Employee employee);
	void deleteById(int id);
	List<Employee> searchByFirstName(String firstName);
	List<Employee> findAllCustomSorted(Direction direction);
	//Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
