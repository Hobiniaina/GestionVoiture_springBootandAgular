package com.voiture.controlleur;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voiture.models.CommentVoiture;
import com.voiture.models.Voiture;
import com.voiture.services.CommentVoitureServices;
import com.voiture.services.VoitureService;

@RestController
@CrossOrigin
@RequestMapping("/api/voiture")
public class VoitureControlleur {

	@Autowired
	VoitureService service;

	@Autowired
	CommentVoitureServices cservices;

	int max = 15;

	@GetMapping(value = "/findAllVoiture")
	public ResponseEntity<Object> listeVoiture() {
		try {
			List<Voiture> list = new ArrayList<>();
			list = service.getAll();
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping(value = "/saveVoiture")
//	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Object> save(@RequestBody Voiture voiture) {
		try {
			return new ResponseEntity<>(service.saveVoiture(voiture), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping(value = "/commenterVoiture")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public ResponseEntity<Object> comenter(@RequestBody CommentVoiture cvoiture) {
		try {
			CommentVoiture vt = cservices.save(cvoiture);
			return new ResponseEntity<>(vt, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping(value = "/voirComment/{idv}")
	public ResponseEntity<Object> voirComment(@PathVariable Long idv) {
		try {
			List<CommentVoiture> list = cservices.voirCommentaire(idv);
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
		}
	}

}
