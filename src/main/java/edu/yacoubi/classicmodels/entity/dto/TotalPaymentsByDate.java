package edu.yacoubi.classicmodels.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@ToString
public class TotalPaymentsByDate {
    private LocalDate paymentDate;
    private BigDecimal amount;
}
