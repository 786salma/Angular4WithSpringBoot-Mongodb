package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Personal;
import com.example.demo.repo.PersonalRepo;
import com.example.demo.entity.Personal;

@Component
public class PersonalService {

	@Autowired
	private PersonalRepo repo;

	public List<Personal> findAll() {
		return repo.findAll();
	}

	public Personal save(Personal personal) {
		return repo.save(personal);
	}

	/*
	 * 	public Personal findById(String id) {
		return repo.findById(id).get();
	}

	public Personal insert(Personal personal) {
		return repo.insert(personal);
	}
	 * public void savePersonal(Personal personal) { repo.save(personal); }
	 */

}
