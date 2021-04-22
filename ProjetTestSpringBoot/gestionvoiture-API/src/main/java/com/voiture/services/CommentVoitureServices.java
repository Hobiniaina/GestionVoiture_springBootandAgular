package com.voiture.services;

import java.util.List;

import com.voiture.models.CommentVoiture;

public interface CommentVoitureServices extends CRUDService<CommentVoiture> {

	List<CommentVoiture> voirCommentaire(Long idv);
}
