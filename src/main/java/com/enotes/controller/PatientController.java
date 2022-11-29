package com.enotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enotes.entity.Patient;
import com.enotes.repository.PatientRepository;

@RestController
public class PatientController {
	@Autowired
	private PatientRepository patientRepository;
	
	@GetMapping ("/Patients")
	public List<Patient> patientList(){
		 return patientRepository.findAll();
	}
	
	

}
