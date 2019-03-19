package com.demo.tranthanh.models;

import java.util.ArrayList;
import java.util.List;

import com.demo.tranthanh.entities.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class ProductModel {
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public List<Product> findAll() {
		List<Product> productList = new ArrayList<Product>();
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Query<Product> query = session.createQuery("from Product");
			productList = query.list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return productList;
	}

	public Product findById(int Id) {
		Product product = null;
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Query<Product> query = session.createQuery("from Product product where product.id=:id").setParameter("id", Id);
			product = query.getSingleResult();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return product;
	}

	public Integer create(Product product) {
		Integer result = null;
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			result = (Integer) session.save(product);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}

	public boolean update(Product product) {
		boolean result = true;
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.update(product);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			result = false;
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}

	public boolean delete(Product product) {
		boolean result = true;
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.delete(product);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			result = false;
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}
		
	
}
