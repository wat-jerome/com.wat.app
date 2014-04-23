package com.wat.app.demo.service.impl;

import com.wat.app.demo.beans.Person;
import com.wat.app.demo.dao.PersonDao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

@Repository( "personDao" )
public class PersonDaoImpl implements PersonDao
{
	private Session session;
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
    @Override
    public Person findById( Long id )
    {
        return ( Person )getSession().get( Person.class, id );
    }

    @Override
    public List<Person> findAll()
    {
        return null;
    }

    @Override
    public void save( Person person )
    {
        getSession().save( person );
    }

    @Override
    public void update( Person person )
    {
        getSession().update( person );
    }

    @Override
    public void delete( Person person )
    {
        getSession().delete( person );
    }
	
	private Session getSession(){
		Session session=sessionFactory.getCurrentSession();
		return session;
	}


}