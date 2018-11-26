package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Education;

public interface EducationRepo extends MongoRepository<Education, String> {

}
