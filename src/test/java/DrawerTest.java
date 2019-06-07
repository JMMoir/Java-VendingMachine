import VendingMachine.Product.Drawer.Drawer;
import VendingMachine.Product.Drawer.DrawerType;
import VendingMachine.Product.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DrawerTest {

    private Drawer drawer;
    private Product product;

    @Before

    public void setUp() {
        product = new Product("Cola", 100);
        drawer = new Drawer(DrawerType.A1, product);
    }

    @Test
    public void canGetDrawerCode() {
        assertEquals("A1", drawer.getCode());
    }

    @Test
    public void canGetProductName() {
        assertEquals("Cola", drawer.getProductName());
    }

    @Test
    public void canGetProductCost() {
        assertEquals(100, drawer.getProductCost());
    }
}
