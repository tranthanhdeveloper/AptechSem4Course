package com.demo.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.dao.utils.HibernateUtil;

public abstract class GenericDaoImpl<T extends Serializable> implements GenericDao<T> {
	private static final Log log = LogFactory.getLog(GenericDaoImpl.class);
	protected SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public T findById(final Class<T> entityType, int id) throws Exception {
		log.debug("getting entity instance with id: " + id);
		
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			T instance = session.get(entityType, id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (Exception exception) {
			log.error("get entity failed", exception);
			throw exception;
		}
	}

	public List<T> findAll(final Class<T> persistentClass) throws Exception {
		log.debug("getting all product instances");
		List<T> entityList = new ArrayList<T>();
		try {
			final Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Query<T> createQuery = session.createQuery("from "+ persistentClass.getName());
			entityList =  createQuery.getResultList();
			
			if (entityList.size() == 0) {
				log.debug("get successful, no instances found");
			} else {
				log.debug("get successful, instance found");
			}
			return entityList;

		} catch (Exception exception) {
			log.error("Getting all entities instances failed", exception);
			throw exception;
		}
	}

	public void add(T entity) throws Exception {
		log.debug("trying add new entity instances");
		List<T> entityList = new ArrayList<T>();
		try {
			sessionFactory.getCurrentSession().save(entity);
			if (entityList.size() == 0) {
				log.debug("get successful, no instances found");
			} else {
				log.debug("get successful, instance found");
			}
		} catch (Exception exception) {
			log.error("Has errors occurred during adding new entity", exception);
			throw exception;
		}
	}

	public void update(T entity) throws Exception {
		log.debug("trying update an existing entity instances");
		try {
			sessionFactory.getCurrentSession().update(entity);
			log.debug("updating successful");
		} catch (Exception re) {
			log.error("Updating object has occurred errors", re);
			throw re;
		}
	}

	public void delete(T entity) throws Exception {
		log.debug("trying delete a entity instances");
		try {
			sessionFactory.getCurrentSession().delete(entity);
			log.debug("Deleting successful");
		} catch (Exception re) {
			log.error("Deleting object has occurred errors", re);
			throw re;
		}
	}

	abstract public void delete(int id);
	
}
