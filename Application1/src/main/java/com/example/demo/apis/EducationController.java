package com.example.demo.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Education;
import com.example.demo.entity.Personal;
import com.example.demo.service.EducationService;

@RestController
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RequestMapping("/api")
public class EducationController {

	@Autowired
	private EducationService educationService;
	
	@RequestMapping("/getEducation")
	public List<Education> getAllEducation(){
		return educationService.findAll();
	}
	
	@RequestMapping(value = "/addEducation", method = RequestMethod.POST, 
            consumes = "application/json", produces = "application/json")
	public Education addEducation(@RequestBody Education education) {
		return educationService.save(education);
	}
	
}
