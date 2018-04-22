package py.com.edge.learning.spring.simpleproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import py.com.edge.learning.spring.simpleproject.model.Person;
import py.com.edge.learning.spring.simpleproject.services.PersonServices;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class PersonController {

    @Autowired
    protected PersonServices services;
    @GetMapping("/people")
    List<Person> getAllPerson()
    {
        return services.getAll();
    }
    @GetMapping("/people/{id}")
    Person getPerson(@PathVariable("id") String id)
    {
        System.out.println("valor es "+ id);
        return services.getPersonById(id);
    }
}
