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
import java.time.LocalDate;
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
        callGreaterThanTwiceAverage(txtQuery);

        txtQuery = "2. What is the total of payments received?";
        callTotalPaymentsReceived(txtQuery);

        txtQuery = "3. Report total payments for October 28, 2004?";
        callTotalPaymentsFor(txtQuery);

        txtQuery = "4. Report those payments greater than $100,000?";
        callGreaterThan(txtQuery);

        txtQuery = "5. What is the minimum payment received?";
        callMinPaymentReceived(txtQuery);


    }

    private void callMinPaymentReceived(String txtQuery) {
        System.out.println(txtQuery);
        System.out.println(repository.minPaymentReceived());
        System.out.println();
    }

    private void callGreaterThan(String txtQuery) {
        System.out.println(txtQuery);
        List<Payment> paymentGreaterThan =
                repository.greaterThan(BigDecimal.valueOf(100_000));
        paymentGreaterThan.forEach(System.out::println);
        System.out.println();
    }

    private void callTotalPaymentsFor(String txtQuery) {
        System.out.println(txtQuery);
        BigDecimal totalPaymentsFor =
                repository.totalPaymentsFor(
                        LocalDate.of(2004, 10, 28)
                );
        System.out.println(totalPaymentsFor);
        System.out.println();
    }

    private void callGreaterThanTwiceAverage(String txtQuery) {
        System.out.println(txtQuery);
        List<Payment> payments = repository.greaterThanTwiceAverage();
        payments.forEach(System.out::println);
        System.out.println();
    }

    private void callTotalPaymentsReceived(String txtQuery) {
        System.out.println(txtQuery);
        BigDecimal totalPayments = repository.totalPaymentsReceived();
        System.out.println(totalPayments);
        System.out.println();
    }
}
