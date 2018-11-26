package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Education;
import com.example.demo.entity.Personal;
import com.example.demo.repo.EducationRepo;

@Component
public class EducationService {
	
	@Autowired
	private EducationRepo educationRepo;
	
	public List<Education> findAll(){
		return educationRepo.findAll();
	}
	
	public Education save( Education education) {
		return educationRepo.save(education);
	}

	
}
