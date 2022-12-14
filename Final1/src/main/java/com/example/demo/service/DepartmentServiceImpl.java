package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Department;
import com.example.demo.repository.DepartmentRepository;



@Transactional //Spring dynamically creates a proxy that implements the same interface(s) as the class that gets annotated
@Service("departmentService") // to detected by @Autowired
public class DepartmentServiceImpl {

	
	@Autowired //automatically injects the implementation of crudrepo
	private DepartmentRepository departmentRepository;
	
	public Optional<Department> find(Integer id)
	{
		return this.departmentRepository.findById(id);
	}
}
