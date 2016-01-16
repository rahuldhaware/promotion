package com.promotion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.promotion.model.Person;
import com.promotion.service.PersonService;

@RestController
@RequestMapping(value="person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public void save(Person person){
		
		personService.savePerson(person);
		
	}
	
}
