package edu.dnahernyak.tdddev.service;

import edu.dnahernyak.tdddev.model.Patient;
import edu.dnahernyak.tdddev.repository.PatientRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    private List<Patient> patients = List.of(
            new Patient("1", "Denys", "+380688849342", "Problems with back", LocalDateTime.now()),
            new Patient("2", "John", "+380688849343", "Problems with neck", LocalDateTime.now()),
            new Patient("3", "Junior", "+380688849345", "Problems with liver", LocalDateTime.now())
    );

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

//    @PostConstruct
    void init() {
        this.patientRepository.saveAll(this.patients);
    }

    public List<Patient> getAll() {
        return this.patientRepository.findAll();
    }
}
