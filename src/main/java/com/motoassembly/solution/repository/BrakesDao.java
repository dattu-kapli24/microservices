package com.motoassembly.solution.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.motoassembly.solution.models.Brakes;

@Repository
public interface BrakesDao extends MongoRepository<Brakes,String>{

}
