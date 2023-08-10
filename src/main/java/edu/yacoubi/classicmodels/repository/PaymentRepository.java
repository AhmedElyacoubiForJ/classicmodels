package edu.yacoubi.classicmodels.repository;

import edu.yacoubi.classicmodels.entity.Customer;
import edu.yacoubi.classicmodels.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, String> {

    List<Payment> findByCustomerNumber(Customer customerNumber);


}