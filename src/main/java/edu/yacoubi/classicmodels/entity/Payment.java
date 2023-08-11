package edu.yacoubi.classicmodels.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
@Data
public class Payment {
    @Id
    @Column(
            name = "checkNumber",
            nullable = false,
            updatable = false,
            length = 50
    )
    private String checkNumber;

    @Column(
            name = "paymentDate",
            nullable = false
    )
    private LocalDate paymentDate;

    @Column(
            nullable = false,
            precision = 12,
            scale = 2
    )
    private BigDecimal amount;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "customerNumber",
            nullable = false
    )
    private Customer customer;
}