package com.voiture.services;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.voiture.models.Voiture;

public interface VoitureService extends CRUDService<Voiture> {

	List<Voiture> listeVoiture(Pageable pageable);

	Voiture getVoitureById(Long id);
	

	Voiture saveVoiture(Voiture voiture);
}
