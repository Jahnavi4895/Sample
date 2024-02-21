package edu.ucmo.cs;

import org.springframework.data.mongodb.repository.MongoRepository;
public interface Repository extends MongoRepository<Netflix, String>  {

}