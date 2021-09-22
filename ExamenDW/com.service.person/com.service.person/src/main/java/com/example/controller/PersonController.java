package com.example.controller;

import java.net.URI;
import java.util.List;
import com.example.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.repository.PersonRepository;
import com.example.service.PersonService;



@RestController
@RequestMapping("/person")
public class PersonController {
    
    @Autowired
    PersonRepository repositorio; 
    
    @Autowired
    PersonService personservice;
    
    
    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAllPerson() { return ResponseEntity.ok((List)repositorio.findAll());}

    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addPerson(@RequestBody Person newPerson) throws Exception{
        Person savePerson = repositorio.save(newPerson);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(savePerson);
    }

  }
