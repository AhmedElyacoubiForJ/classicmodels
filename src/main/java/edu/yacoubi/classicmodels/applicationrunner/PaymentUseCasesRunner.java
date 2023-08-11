package edu.yacoubi.classicmodels.applicationrunner;

import edu.yacoubi.classicmodels.Main;
import edu.yacoubi.classicmodels.entity.Payment;
import edu.yacoubi.classicmodels.repository.PaymentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class PaymentUseCasesRunner implements CommandLineRunner {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(PaymentUseCasesRunner.class);

    @Autowired
    PaymentRepository repository;

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("... PaymentUseCasesRunner ...");
        String txtQuery;

        System.out.println("********* Query results *********");

        txtQuery = "1. List all payments greater than twice the average payment?";
        System.out.println(txtQuery);
        List<Payment> payments = repository.greaterThanTwiceAverage();
        payments.forEach(System.out::println);
        System.out.println();

        txtQuery = "2. What is the total of payments received?";
        System.out.println(txtQuery);
        BigDecimal totalPayments = repository.totalPaymentsReceived();
        System.out.println(totalPayments);



    }
}
