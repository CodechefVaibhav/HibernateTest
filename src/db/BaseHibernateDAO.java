package db;

import org.hibernate.Session;

import db.HibernateSessionFactory;


/**
 * Data access object (DAO) for domain model
 * 
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
}