package com.isi.securiteweb.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.isi.securiteweb.entities.DroitsEntity;
import com.isi.securiteweb.entities.ComptesEntity;


public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();

 				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
				settings.put(Environment.URL,
						"jdbc:mysql://localhost:3306/securitewebdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
				settings.put(Environment.USER, "usersec");
				settings.put(Environment.PASS, "usersec");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
				//cette ligne est très importante
				settings.put(Environment.HBM2DDL_AUTO, "update");
				
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.FORMAT_SQL, "true");

				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

				configuration.setProperties(settings);
				configuration.addAnnotatedClass(ComptesEntity.class);
				configuration.addAnnotatedClass(DroitsEntity.class);
 
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
 				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				return sessionFactory;

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}