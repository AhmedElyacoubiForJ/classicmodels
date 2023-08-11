package edu.yacoubi.classicmodels.repository;

import edu.yacoubi.classicmodels.entity.Payment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PaymentRepositoryTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentRepositoryTest.class);

    @Autowired
    private PaymentRepository repository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAll() {
    }

    @Test
    void getCustomerByPayment() {
        Optional<Payment> paymentOptional = repository.findById("HQ336336");
        Payment payment = paymentOptional.get();
        System.out.println(payment.getCustomer());
        LOGGER.info("\u001B[32m"+ payment.getCustomer().toString() + "\u001B[0m");
    }

    // List all payments greater than twice the average payment
    @Test
    void paymentsGreaterThanTwiceAverage() {
        LOGGER.info("\u001B[32m... paymentsGreaterThanTwiceAverage ...\u001B[0m");
        List<Payment> payments = repository.greaterThanTwiceAverage();
        Assert.notNull(payments, "");
        assertEquals(13, payments.size());

        payments.forEach( payment -> {
            //LOGGER.info("\u001B[32m" + payment + "\u001B[0m");
            System.out.println("\u001B[32m" + payment.getCheckNumber() + "\u001B[0m");
        });
    }

    @AfterEach
    void tearDown() {
    }
}