package com.enotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enotes.entity.Patient;

public interface PatientRepository  extends JpaRepository<Patient,Long>{

	 Patient findByNom(String name);
	 
}
