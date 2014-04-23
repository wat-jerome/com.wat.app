package com.wat.app.demo.dao;

import com.wat.app.demo.beans.Person;
import java.util.List;

public interface PersonDao{
    public Person findById( Long id );
	
    public List<Person> findAll();

    public void save( Person person );

	public void update( Person person );
    public void delete( Person person );

}