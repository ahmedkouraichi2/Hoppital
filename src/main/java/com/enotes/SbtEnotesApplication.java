package com.enotes;

import java.util.Date;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.enotes.entity.Medecin;
import com.enotes.entity.Patient;
import com.enotes.repository.MedecinRepository;
import com.enotes.repository.PatientRepository;

@SpringBootApplication
@EnableJpaAuditing
public class SbtEnotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbtEnotesApplication.class, args);
	}
	
	
	@Bean
	CommandLineRunner start(PatientRepository  patientRepository ,
			                MedecinRepository medecinRepository
			                
			  ) {
		 return args ->{
			 
			 Stream.of("Yassine ","Nassime ","Edrrisse").forEach(name->{
				 
				 Patient patient = new Patient();
				 patient.setNom(name);
				 patient.setDateNaissance(new Date());
				 patient.setMalade(false);
				 patientRepository.save(patient);
				 
				 
			 });
			 
			 
						 
			 Stream.of("Mohamed","Hassen","Najet").forEach(name->{
							 
							 Medecin m = new Medecin();
							 m.setNom(name);
							 m.setSpecialite(Math.random()>0.5?"Cardio":"dentiste");
							 
							 
							 
						 });
			 
			
		 };
		 
		 
		 
		 
		 
	}
	
	
	

}
