package py.com.edge.learning.spring.simpleproject.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.com.edge.learning.spring.simpleproject.model.Person;
import py.com.edge.learning.spring.simpleproject.repository.PersonRepository;
import py.com.edge.learning.spring.simpleproject.services.PersonServices;


import java.util.List;
import java.util.Optional;


@Service
public class PersonServiceImpl implements PersonServices {


    @Autowired
    PersonRepository repository;


    @Override
    public List<Person> getAll() {

     return       this.repository.findAll();
    }

    @Override
    public Person getPersonById(String id) {

         Optional<Person> op=this.repository.findById(id);

         if (op.isPresent())
             return op.get();
         else
             return new Person();
    }


}
