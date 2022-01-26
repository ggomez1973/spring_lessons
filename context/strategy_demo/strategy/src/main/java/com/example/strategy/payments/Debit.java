package com.example.strategy.payments;

import com.example.strategy.domain.InvoiceRow;

import java.math.BigDecimal;
import java.util.List;

public class Debit implements PaymentType {

    @Override
    public BigDecimal getTotal(List<InvoiceRow> rows) {
        return rows.stream()
                .map(InvoiceRow::getRowValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}