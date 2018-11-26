package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Personal;

public interface PersonalRepo extends MongoRepository<Personal, String> {

}


