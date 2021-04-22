package com.voiture.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "commentVoiture")
public class CommentVoiture implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "idComment")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idComment;
	@ManyToOne
	@JoinColumn(name = "id_v")
	private Voiture voiture;
	private String commentaire;

	public CommentVoiture() {
		super();
	}

	public long getIdComment() {
		return idComment;
	}

	public void setIdComment(long idComment) {
		this.idComment = idComment;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
