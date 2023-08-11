package edu.yacoubi.classicmodels.repository;

import edu.yacoubi.classicmodels.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, String> {

    // 1. List all payments greater than twice the average payment;
    @Query(value = "SELECT * FROM payments p WHERE p.amount > 2*(SELECT AVG(amount) FROM payments)", nativeQuery = true)
    List<Payment> greaterThanTwiceAverage();

    // 2. What is the total of payments received?
    @Query(value = "SELECT SUM(p.amount) FROM payments p", nativeQuery = true)
    BigDecimal totalPaymentsReceived();

    // 3. Report total payments for October 28, 2004?
    // SELECT SUM(p.amount) FROM payments p WHERE p.paymentDate = "2004-10-28
    @Query(value = "SELECT SUM(p.amount) FROM payments p WHERE p.paymentDate = :paymentDate", nativeQuery = true)
    BigDecimal totalPaymentsFor(@Param(value = "paymentDate") LocalDate paymentDate);

    // 4. Report those payments greater than $100,000?
    // SELECT * FROM payments p WHERE p.amount > 100000
    @Query(value = "SELECT * FROM payments p WHERE p.amount > :amount", nativeQuery = true)
    List<Payment> greaterThan(@Param(value = "amount") BigDecimal amount);
}