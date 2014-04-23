package com.wat.app.demo.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person implements Serializable{
	@Id
	@GeneratedValue
	private Integer personId;
	@Column(name="username")
    private String username;
	@Column(name="password")
	private String password;
	@Column(name="age")
    private Integer age;

	public void setPersonId(Integer personId){
		this.personId=personId;
	}
	
	public Integer getPersonId(){
		return this.personId;
	}
	
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

	public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
	
	
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Person(Username: " + this.username + ", Age: " + this.age + ")";
    }

}