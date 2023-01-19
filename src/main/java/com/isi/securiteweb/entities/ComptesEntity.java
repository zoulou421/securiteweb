package com.isi.securiteweb.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="comptes")
public class ComptesEntity implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="username", nullable=false, length=200)
	private String userName;
	
	/*@Column(name="email", nullable=false, length=200, unique=true)
	private String email;*/

	@Column(name="password", nullable=false, length=200)
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	List<DroitsEntity> droits= new ArrayList<DroitsEntity>();
	
	public ComptesEntity() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<DroitsEntity> getDroitsEntity() {
		return droits;
	}

	public void setDroitsEntity(List<DroitsEntity> droits) {
		this.droits = droits;
	}
	
	
	
}
