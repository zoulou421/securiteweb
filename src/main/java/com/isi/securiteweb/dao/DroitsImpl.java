package com.isi.securiteweb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.isi.securiteweb.config.HibernateUtil;
import com.isi.securiteweb.entities.DroitsEntity;

public class DroitsImpl implements IDroits{

	private Session session;
	private Transaction transaction;
	
	
	public DroitsImpl() {
		session=HibernateUtil.getSessionFactory().openSession();
	}

	public int save(DroitsEntity droits) {
		try {
			transaction =session.beginTransaction();
			session.save(droits);
			transaction.commit();
			return 1;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}

	public DroitsEntity get(int id) {
		try {
			return session.get(DroitsEntity.class, id);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
	     }	
	}

	public int update(DroitsEntity droits) {
		try {
			transaction=session.beginTransaction();
			session.merge(droits);
			transaction.commit();
			return 1;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public int remove(int id) {
		try {
			transaction=session.beginTransaction();
			//session.delete(session.get(Droits.class, id));
			session.delete(get(id));
			transaction.commit();
			return 1;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
	     }	
	}

	@SuppressWarnings("unchecked")
	public List<DroitsEntity> getAll() {
		try {
		
			return session.createQuery("select droits from AppRole droits").getResultList();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
	     }	
	}

}
