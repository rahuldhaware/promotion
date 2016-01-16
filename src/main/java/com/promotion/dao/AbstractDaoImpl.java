package com.promotion.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AbstractDaoImpl<K, E> implements AbstractDao<K, E> {

	protected Class<E> entityClass;
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public AbstractDaoImpl(){
		Type t = getClass().getGenericSuperclass();
		ParameterizedType genericSuperclass = (ParameterizedType) t;
		this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[1];
	}
	
	public void persist(E entity) {
		entityManager.persist(entity);
	}

	public void update(E entity) {
		entityManager.merge(entity);
	}

	public void remove(E entity) {
		entityManager.remove(this.entityManager.merge(entity));
	}

	public E find(K id) {
		return entityManager.find(entityClass, id);
	}

}
