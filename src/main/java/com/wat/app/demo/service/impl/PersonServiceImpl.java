package com.wat.app.demo.service.impl;

import com.wat.app.demo.beans.Person;
import com.wat.app.demo.service.PersonService;
import com.wat.app.demo.dao.PersonDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

@Transactional(propagation=Propagation.REQUIRED)
@Service("personService")
public class PersonServiceImpl implements PersonService{
	@Autowired
    private PersonDao personDao;
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public void regPerson(Person person){
		personDao.save( person );
	}
}