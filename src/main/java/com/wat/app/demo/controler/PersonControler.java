package com.wat.app.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute; 

import com.wat.app.demo.beans.Person;
import com.wat.app.demo.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonControler{
	 @Autowired
	 private PersonService personService;
		// get and 
	 @RequestMapping(value="/say", method={RequestMethod.GET})
	  public String say(@RequestParam("username") String name, Model model) {
		Person person=new Person();
		person.setUsername(name);
		personService.regPerson(person);
		model.addAttribute("person",person);
        return "say";
    }
	 @RequestMapping(value="/login", method={RequestMethod.POST})
	  public String login(@ModelAttribute("person") Person person) {
        return "say";
    }
}