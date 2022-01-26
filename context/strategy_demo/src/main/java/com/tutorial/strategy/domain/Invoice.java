package com.tutorial.strategy.domain;

import com.tutorial.strategy.payments.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private final List<InvoiceRow> rows;
    private final PaymentType paymentType;

    public Invoice(Payments payment) {
        rows = new ArrayList<>();
        switch (payment) {
            case CREDIT -> paymentType = new Credit();
            case CHECK -> paymentType = new Check();
            default -> paymentType = new Debit();
        }
    }

    public void addItem(Item item1, int i) {
        InvoiceRow invoiceRow = new InvoiceRow(item1, i);
        rows.add(invoiceRow);
    }

    public List<InvoiceRow> getRows() {
        return rows;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public BigDecimal getTotal() {
        return this.paymentType.getTotal(this.rows);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                ", rows=" + rows +
                ", paymentType=" + paymentType +
                ", total=" + getTotal() +
                '}';
    }
}
