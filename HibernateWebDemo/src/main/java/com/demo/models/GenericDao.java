package com.demo.models;

import java.util.List;

public interface GenericDao<T> {
	T findById(final Class<T> type, int id) throws Exception;

	List<T> findAll(final Class<T> persistentClass) throws Exception;

	void add(T entity) throws Exception;

	void update(T entity) throws Exception;

	void delete(T entity) throws Exception;

	void delete(int id) throws Exception;

}
