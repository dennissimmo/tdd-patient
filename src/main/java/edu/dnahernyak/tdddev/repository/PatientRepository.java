package edu.dnahernyak.tdddev.repository;

import edu.dnahernyak.tdddev.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {

}
