package edu.yacoubi.classicmodels.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PaymentRepositoryTest {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAll() {
        //paymentRepository.findAll().forEach(System.out::println);
    }

    @Test
    void getCustomerPayments() {
        paymentRepository.findByCustomerNumber(
                customerRepository.findById(103).get()
        ).forEach(System.out::println);
    }

    @AfterEach
    void tearDown() {
    }
}