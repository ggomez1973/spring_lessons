package com.example.strategy.payments;

import com.example.strategy.domain.InvoiceRow;

import java.math.BigDecimal;
import java.util.List;

public interface PaymentType {
    BigDecimal getTotal(List<InvoiceRow> rows);
}
