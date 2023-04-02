package edu.dnahernyak.tdddev.controller;

import edu.dnahernyak.tdddev.model.Patient;
import edu.dnahernyak.tdddev.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/patients")
public class PatientController {

    private final PatientService patientService;

    @Autowired

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/")
    List<Patient> getAll() {
        return this.patientService.getAll();
    }

}
