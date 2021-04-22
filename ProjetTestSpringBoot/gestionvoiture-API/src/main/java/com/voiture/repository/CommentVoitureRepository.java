package com.voiture.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.voiture.models.CommentVoiture;

public interface CommentVoitureRepository extends JpaRepository<CommentVoiture, Long> {

	@Query(value = "SELECT * FROM public.commentvoiture WHERE id_v = ?1",nativeQuery = true)
	List<CommentVoiture> voirCommentaire(Long idv);
}
