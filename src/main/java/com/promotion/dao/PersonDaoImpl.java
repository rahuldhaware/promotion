package com.promotion.dao;

import org.springframework.stereotype.Repository;

import com.promotion.model.Person;

@Repository("personDao")
public class PersonDaoImpl extends AbstractDaoImpl<Long, Person> implements PersonDao {
	
}
