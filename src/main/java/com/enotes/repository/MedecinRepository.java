package com.enotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enotes.entity.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {

}
