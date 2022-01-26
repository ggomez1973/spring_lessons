package com.tutorial.strategy.payments;

import com.tutorial.strategy.domain.InvoiceRow;

import java.math.BigDecimal;
import java.util.List;

public interface PaymentType {
    BigDecimal getTotal(List<InvoiceRow> rows);
}
