package com.example.service;

import java.util.List;
import com.example.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    
    private List<Person> person;
    
    public List<Person> getPerson() { return this.person;}
    
}
