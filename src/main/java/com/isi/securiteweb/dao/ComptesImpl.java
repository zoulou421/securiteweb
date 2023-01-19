package com.isi.securiteweb.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.isi.securiteweb.config.HibernateUtil;
import com.isi.securiteweb.entities.ComptesEntity;

public class ComptesImpl implements IComptes{

	private Session session;
	private Transaction transaction;
	
	public ComptesImpl() {
		session=HibernateUtil.getSessionFactory().openSession();
	}	
	
	public int save(ComptesEntity comptes) {
		try {
			transaction =session.beginTransaction();
			session.save(comptes);
			transaction.commit();
			return 1;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public ComptesEntity get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ComptesEntity login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}



}
