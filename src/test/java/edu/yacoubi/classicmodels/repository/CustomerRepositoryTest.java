package edu.yacoubi.classicmodels.repository;

import edu.yacoubi.classicmodels.entity.Customer;
import org.apache.tomcat.util.log.SystemLogHandler;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

    @AfterEach
    void tearDown() {
    }
}