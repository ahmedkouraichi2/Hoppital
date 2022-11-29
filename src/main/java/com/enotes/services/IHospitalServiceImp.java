package com.enotes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.enotes.entity.Consultation;
import com.enotes.entity.Medecin;
import com.enotes.entity.Patient;
import com.enotes.entity.RendezVous;
import com.enotes.repository.ConsultationRepository;
import com.enotes.repository.MedecinRepository;
import com.enotes.repository.PatientRepository;
import com.enotes.repository.RendezVousRepository;

@Service 
@Transactional
public class IHospitalServiceImp implements IHospitalServices {
	@Autowired 
	private  PatientRepository      patientRepository;
	
	@Autowired 
	private  MedecinRepository      medecinRepository;
	
	@Autowired 
	private  RendezVousRepository   rendezVousRepository;
	
	@Autowired 
	private  ConsultationRepository consultationRepository ;
 
	@Override
	public Patient savePatient(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public Medecin saveMedecin(Medecin medecin) {
		return medecinRepository.save(medecin);
	}

	@Override
	public RendezVous saveRendezVous(RendezVous rendezVous) {
		return rendezVousRepository.save(rendezVous);
	}

	@Override
	public Consultation saveConsultation(Consultation consultation) {
		return consultationRepository.save(consultation) ;
	} 

}
