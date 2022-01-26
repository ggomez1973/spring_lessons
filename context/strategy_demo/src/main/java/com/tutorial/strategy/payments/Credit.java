package com.tutorial.strategy.payments;

import com.tutorial.strategy.domain.InvoiceRow;

import java.math.BigDecimal;
import java.util.List;

public class Credit implements PaymentType {
    @Override
    public BigDecimal getTotal(List<InvoiceRow> rows) {
        BigDecimal total = rows.stream()
                .map(InvoiceRow::getRowValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal charge = total.multiply(new BigDecimal("0.10"));
        return total.add(charge);
    }
}
