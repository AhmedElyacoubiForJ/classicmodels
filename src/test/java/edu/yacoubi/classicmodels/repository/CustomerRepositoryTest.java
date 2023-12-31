package edu.yacoubi.classicmodels.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository repository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAll() {
        repository.findAll().forEach(System.out::println);
    }

    @Test
    void getCustomerPayments() {
        //repository.findById(103).get();
    }

    @AfterEach
    void tearDown() {
    }
}