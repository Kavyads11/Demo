package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employe;
import com.example.demo.repository.EmployeRepository;


@Transactional
@Service("studentService")
public class EmployeServiceImpl implements EmployeService {
	
	@Autowired
	private EmployeRepository studentRepository;

	@Override
	public Employe insert(Employe student) {
		return this.studentRepository.save(student);
	}

}
