package edu.yacoubi.classicmodels.repository;

import edu.yacoubi.classicmodels.entity.Customer;
import edu.yacoubi.classicmodels.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface PaymentRepository extends JpaRepository<Payment, String> {
    Set<Payment> findByCustomerNumber(Customer customerNumber);
}