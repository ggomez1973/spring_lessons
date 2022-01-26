import com.tutorial.strategy.domain.Invoice;
import com.tutorial.strategy.domain.Item;
import com.tutorial.strategy.payments.Credit;
import com.tutorial.strategy.payments.Debit;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        Item item1 = new Item("Birra copada", new BigDecimal("100"));
        Item item2 = new Item("Whiskacho", new BigDecimal("900"));
        Invoice invoice = new Invoice(new Credit());
        invoice.addItem(item1, 1);
        invoice.addItem(item2, 1);
        System.out.println(invoice);
    }
}
