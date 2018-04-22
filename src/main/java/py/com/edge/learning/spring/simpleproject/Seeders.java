package py.com.edge.learning.spring.simpleproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import py.com.edge.learning.spring.simpleproject.model.Person;
import py.com.edge.learning.spring.simpleproject.repository.PersonRepository;

@Component
public class Seeders implements CommandLineRunner {

    @Autowired
    protected PersonRepository repository;
    @Override
    public void run(String... args) throws Exception {

        Person p=new Person("1","Juan",12);
        repository.insert(p);


    }

}
