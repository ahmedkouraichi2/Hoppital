package com.enotes.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor  @AllArgsConstructor  


public class Patient {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String nom;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private boolean malade;
	
	@OneToMany(mappedBy = "patient" ,fetch = FetchType.LAZY)
	private Collection<RendezVous> rendezVous;
	
	 
	
	
	

}
