import com.tutorial.strategy.domain.Invoice;
import com.tutorial.strategy.domain.Item;

import java.math.BigDecimal;


/**
 * Comentario!!
 */
public class Main {
    public static void main(String[] args){
        Item item1 = new Item("Birra copada", new BigDecimal("150.50"));
        Item item2 = new Item("Whiskacho", new BigDecimal("34330.80"));
        Invoice invoice = new Invoice();
        invoice.addItem(item1, 14);
        invoice.addItem(item2, 3);
        System.out.println(invoice);
    }
}
