package com.voiture.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.voiture.models.Voiture;
import com.voiture.repository.CommentVoitureRepository;
import com.voiture.repository.VoitureRepository;

@Service
public class VoitureServiceImpl implements VoitureService {

	@Autowired
	VoitureRepository repository;

	@Autowired
	CommentVoitureRepository commRepository;

	@Override
	public Voiture save(Voiture entity) {
		// TODO Auto-generated method stub
		return repository.save(entity);
	}

	@Override
	public Voiture getById(Serializable id) {
		// TODO Auto-generated method stub
		return repository.getOne((Long) id);
	}

	@Override
	public List<Voiture> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void delete(Voiture entity) {
		// TODO Auto-generated method stub
		repository.delete(entity);
	}

	@Override
	public int nombrepage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Voiture> listeVoiture(Pageable pageable) {
		// TODO Auto-generated method stub
		return repository.findAll(pageable).getContent();
	}

	@Override
	public Voiture getVoitureById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById_v(id);
	}

	@Override
	public Voiture saveVoiture(Voiture voiture) {
		// TODO Auto-generated method stub

		return repository.save(voiture);
	}

}
