package com.restservice.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {
	@Autowired CustomerRepository customerRepository;
	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer("nickson","kipkorir");
		customerRepository.save(customer);
	}
}
