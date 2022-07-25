package com.example.demo.res_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.repo.PersonRepository;



@RestController
@RequestMapping("/person")
public class PersonRestController {
 @Autowired
 private PersonRepository personRepository;
 @GetMapping("/get")
 public List<Person>listPersons()
 {
 	return personRepository.findAll();
 }
 @PostMapping("/post")
 public Person addPerson(@RequestBody Person person)
 {
 	return personRepository.save(person);
 }
 @PutMapping("/put1")
 public Person updatePerson(@RequestBody Person person)
 {
 	return personRepository.save(person);
 }
 @DeleteMapping("/del1")
 public String deletePerson(@RequestBody Person person)
 {
 	personRepository.delete(person);
 	return "Delete "+person;
 	
 }
}
