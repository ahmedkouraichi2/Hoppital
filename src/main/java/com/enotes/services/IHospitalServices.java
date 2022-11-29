package com.enotes.services;

import com.enotes.entity.Consultation;
import com.enotes.entity.Medecin;
import com.enotes.entity.Patient;
import com.enotes.entity.RendezVous;

public interface IHospitalServices {

	 Patient  savePatient(Patient patient );
	 Medecin  saveMedecin(Medecin medecin );
	 RendezVous saveRendezVous(RendezVous rendezVous);
	 Consultation saveConsultation(Consultation consultation);
	 
	 
}
