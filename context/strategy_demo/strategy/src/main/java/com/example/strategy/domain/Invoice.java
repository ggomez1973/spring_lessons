package com.example.strategy.domain;

import com.example.strategy.payments.PaymentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Component
public class Invoice {
    private final List<InvoiceRow> rows;
    @Autowired
    private PaymentType paymentType;

    public Invoice() {
        rows = new ArrayList<>();
    }

    public Invoice(PaymentType paymentType) {
        this.paymentType = paymentType;
        rows = new ArrayList<>();
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
