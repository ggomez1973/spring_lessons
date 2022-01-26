package com.example.strategy.domain;

import java.math.BigDecimal;

public class InvoiceRow {
    private final Item item;
    private final Integer quantity;

    public InvoiceRow(Item item, Integer quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public BigDecimal getRowValue() {
        return item.getPrice().multiply(new BigDecimal(quantity));
    }

    @Override
    public String toString() {
        return "InvoiceRow{" +
                "item=" + item +
                ", quantity=" + quantity +
                ", rowValue=" + getRowValue() +
                '}';
    }
}
