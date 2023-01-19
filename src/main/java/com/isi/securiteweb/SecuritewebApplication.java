package com.isi.securiteweb;

import java.util.ArrayList;
import java.util.List;

import com.isi.securiteweb.dao.DroitsImpl;
import com.isi.securiteweb.dao.ComptesImpl;
import com.isi.securiteweb.dao.IDroits;
import com.isi.securiteweb.dao.IComptes;
import com.isi.securiteweb.entities.DroitsEntity;
import com.isi.securiteweb.entities.ComptesEntity;

public class SecuritewebApplication {

	public static void main(String[] args) {
		IDroits droitsdao = new DroitsImpl();
		DroitsEntity droits= new DroitsEntity();
		
		droits.setNom("COMPTABLE");
		//int result =droitsdao.save(droits);
		//System.out.println(result);
		
		//roledao.getAll().forEach(r->System.out.println(r.getName()));
		
		
		ComptesEntity comptes= new ComptesEntity();
		comptes.setUserName("Bonevy");
		comptes.setPassword("passer123");
		List<DroitsEntity> droits1 = new ArrayList<DroitsEntity>();
		droits1.add(droitsdao.get(1));//les droits doivent venir de la base de données
		droits1.add(droitsdao.get(2));//les droits doivent venir de la base de données
		
        
        comptes.setDroitsEntity(droits1);
        
        IComptes comptesdao = new ComptesImpl();
        int result=comptesdao.save(comptes);
        if(result==1) {
        	System.out.println("Compte et Droit bien ajoutés");
        }else {
        	System.out.println("pas de succès ajout Compte");
        }
        
        
        

	}

}
