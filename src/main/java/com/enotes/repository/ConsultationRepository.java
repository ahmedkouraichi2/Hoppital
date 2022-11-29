package com.enotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enotes.entity.Consultation;

public interface ConsultationRepository  extends JpaRepository<Consultation,Long>{

}
