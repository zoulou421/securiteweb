package com.isi.securiteweb.dao;

import java.util.List;

import com.isi.securiteweb.entities.DroitsEntity;

public interface IDroits {

	public int save(DroitsEntity droits);
	public int update(DroitsEntity droits);
	public int remove(int id);
	public DroitsEntity get(int id);
	public List<DroitsEntity> getAll();
}
