package org.customer.api.customerapi;

import org.customer.api.customerapi.customer.Customer;
import org.customer.api.customerapi.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
public class CustomerApiApplication {


    public static void main(String[] args) {
        SpringApplication.run(CustomerApiApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository) {
        return args -> {

            Customer alex = new Customer("Alex", "alex@mail.com", 41);

            Customer jamila = new Customer("Jamila", "jamila@mail.com", 23);

            List<Customer> customers = List.of(alex, jamila);

            customerRepository.saveAll(customers);

        };
    }

}
