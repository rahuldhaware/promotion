package com.promotion.dao;

public interface AbstractDao<K,E> {
	void persist(E entity);
	void update(E entity);
	void remove(E entity);
	E find(K id);
}
