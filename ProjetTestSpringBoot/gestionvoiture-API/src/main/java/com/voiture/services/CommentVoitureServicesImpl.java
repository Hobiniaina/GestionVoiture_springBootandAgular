package com.voiture.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voiture.models.CommentVoiture;
import com.voiture.repository.CommentVoitureRepository;

@Service
public class CommentVoitureServicesImpl implements CommentVoitureServices {

	@Autowired
	CommentVoitureRepository repository;

	@Override
	public CommentVoiture save(CommentVoiture entity) {
		// TODO Auto-generated method stub
		return repository.save(entity);
	}

	@Override
	public CommentVoiture getById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommentVoiture> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void delete(CommentVoiture entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public int nombrepage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CommentVoiture> voirCommentaire(Long idv) {
		// TODO Auto-generated method stub
		return repository.voirCommentaire(idv);
	}

}
