package py.com.edge.learning.spring.simpleproject.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import py.com.edge.learning.spring.simpleproject.model.Person;

import java.util.List;
public interface PersonServices {

    List<Person> getAll();
    Person getPersonById(String id);
}
