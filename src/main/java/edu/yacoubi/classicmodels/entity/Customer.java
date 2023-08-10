package edu.yacoubi.classicmodels.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "customers")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerNumber", nullable = false, updatable = false)
    private Integer customerNumber;

    @Column(name = "customerName", nullable = false, length = 50)
    private String customerName;

    @Column(name = "contactLastName", nullable = false, length = 50)
    private String contactLastName;

    @Column(name = "contactFirstName", nullable = false, length = 50)
    private String contactFirstName;

    @Column(nullable = false, length = 50)
    private String phone;

    @Column(name = "addressLine1", nullable = false, length = 50)
    private String addressLine1;

    @Column(name = "addressLine2", length = 50)
    private String addressLine2;

    @Column(nullable = false, length = 50)
    private String city;

    @Column(length = 50)
    private String state;

    @Column(name = "postalCode", length = 15)
    private String postalCode;

    @Column(nullable = false, length = 50)
    private String country;

    @Column(name = "creditLimit", precision = 12, scale = 2)
    private BigDecimal creditLimit;
}
