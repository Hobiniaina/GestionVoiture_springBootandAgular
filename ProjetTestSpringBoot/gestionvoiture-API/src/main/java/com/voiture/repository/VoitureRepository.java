package com.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.voiture.models.Voiture;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {

	@Query(value = "select u from Voiture u where id_v = ?1")
	Voiture findById_v(long id);
}
