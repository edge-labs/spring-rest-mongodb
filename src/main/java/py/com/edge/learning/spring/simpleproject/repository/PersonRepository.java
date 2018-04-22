package py.com.edge.learning.spring.simpleproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import py.com.edge.learning.spring.simpleproject.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person,String> {

    Person findByName(String name);

}
