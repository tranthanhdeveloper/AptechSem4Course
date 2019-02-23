package com.tranthanh.exam.models;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tranthanh.exam.entities.Product;

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


	public List<Product> findByPrice(double priceMin, double priceMax) {
		List<Product> productList = null;
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			productList = (List<Product>) session.createQuery("from Product where price >=:min and price <=:max ")
					.setParameter("min", priceMin)
					.setParameter("max", priceMax)
					.getResultList();
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
	
}
