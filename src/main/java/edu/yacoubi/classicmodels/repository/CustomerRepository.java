package edu.yacoubi.classicmodels.repository;

import edu.yacoubi.classicmodels.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}