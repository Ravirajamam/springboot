/*package com.springrest.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}

}*/

package com.springrest.springrest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;






@SpringBootApplication
@ComponentScan(basePackages = {
	    "com.example.demo.controller",
	    "com.example.demo.service"
	})
	@EnableJpaRepositories(basePackages = "com.example.demo.repository")
	@EntityScan(basePackages = "com.example.demo.entity")

public class SpringrestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringrestApplication.class, args);
    }
}






















