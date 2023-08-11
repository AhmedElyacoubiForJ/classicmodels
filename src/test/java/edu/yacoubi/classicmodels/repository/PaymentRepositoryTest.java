package edu.yacoubi.classicmodels.repository;

import edu.yacoubi.classicmodels.entity.Payment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class PaymentRepositoryTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentRepositoryTest.class);

    @Autowired
    private PaymentRepository paymentRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAll() {
    }

    @Test
    void getCustomerPayments() {
        Optional<Payment> paymentOptional = paymentRepository.findById("HQ336336");
        Payment payment = paymentOptional.get();
        System.out.println(payment.getCustomer());
        LOGGER.info("\u001B[32m"+ payment.getCustomer().toString() + "\u001B[0m");
    }

    @AfterEach
    void tearDown() {
    }
}