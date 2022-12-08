package com.restservice.jpa;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;


    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Bean
    CommandLineRunner commandLineRunner(JpaRepository jpaRepository){

        return  args -> {

            Customer nick = new Customer("Nickson", "Kipkorir");

            jpaRepository.save(nick);
        };
    }
}
