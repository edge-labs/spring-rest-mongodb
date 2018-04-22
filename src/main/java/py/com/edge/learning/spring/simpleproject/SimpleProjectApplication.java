package py.com.edge.learning.spring.simpleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"py.com.edge.learning.spring.simpleproject.services","py.com.edge.learning.spring.simpleproject.repository","py.com.edge.learning.spring.simpleproject.controllers"})
public class SimpleProjectApplication{

        public static void main(String[]args) {
            SpringApplication.run(SimpleProjectApplication.class,args);
        }

/*
        @Bean
        Seeders getSeeder()
        {
            return new Seeders();
        }

*/
}