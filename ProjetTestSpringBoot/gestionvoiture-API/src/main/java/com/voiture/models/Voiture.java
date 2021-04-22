package com.voiture.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "voiture")
public class Voiture implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_voiture")
	private Long id_v;

	@Column(name = "couleur", length = 10)
	private String coleur;

	@Column(name = "marque", length = 50)
	private String marque;

	@Column(name = "prix")
	private int prix;

	@Column(name = "consomation", length = 50)
	private String consomation;

	public Voiture() {
		super();
	}

	public Long getId_v() {
		return id_v;
	}

	public void setId_v(Long id_v) {
		this.id_v = id_v;
	}

	public String getColeur() {
		return coleur;
	}

	public void setColeur(String coleur) {
		this.coleur = coleur;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getConsomation() {
		return consomation;
	}

	public void setConsomation(String consomation) {
		this.consomation = consomation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
