package com.isi.securiteweb.dao;

import com.isi.securiteweb.entities.ComptesEntity;

public interface IComptes {

	public int save(ComptesEntity comptes);
	public ComptesEntity get(int id);
	public ComptesEntity login(String username,String password);
}
