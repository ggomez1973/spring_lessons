package com.tutorial.strategy.domain;

import com.tutorial.strategy.payments.PaymentType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<InvoiceRow> rows;
    private PaymentType paymentType;

    public Invoice() {
        rows = new ArrayList<>();
    }

    public Invoice(PaymentType paymentType) {
        this.paymentType = paymentType;
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
