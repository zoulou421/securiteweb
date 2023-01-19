package com.isi.securiteweb.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="droits")
public class DroitsEntity implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="nom", nullable=false, length=200, unique=true)
	private String nom;
	
	@ManyToMany(mappedBy = "droits")
	List<ComptesEntity> comptes= new ArrayList<ComptesEntity>();

	public DroitsEntity() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<ComptesEntity> getComptesEntity() {
		return comptes;
	}

	public void setComptesEntity(List<ComptesEntity> comptes) {
		this.comptes= comptes;
	}
	
}
