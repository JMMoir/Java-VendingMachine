import VendingMachine.Product.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    private Product product;

    @Before

    public void setUp() {
        product = new Product("Cola", 100);
    }

    @Test
    public void canGetProductName() {
        assertEquals("Cola", product.getName());
    }

    @Test
    public void canGetProductPrice() {
        assertEquals(100, product.getCost());
    }
}
