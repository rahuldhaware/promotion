package com.promotion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.promotion.dao.PersonDao;
import com.promotion.model.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDao personDao;
	
	@Transactional(isolation=Isolation.READ_COMMITTED, rollbackFor=Exception.class)
	public void savePerson(Person person){
		try{
			personDao.persist(person);
		}catch(Exception e){
			
		}
	}
	
}
