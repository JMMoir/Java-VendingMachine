import VendingMachine.Product.Drawer.Drawer;
import VendingMachine.Product.Drawer.DrawerType;
import VendingMachine.Product.Product;
import VendingMachine.Product.VendingMachine;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class VendingMachineTest {

    private VendingMachine vendingMachine;
    private ArrayList<Drawer> drawers;

    @Before

    public void setUp() {
        ArrayList<Drawer> drawers = new ArrayList<Drawer>();
        vendingMachine = new VendingMachine(drawers);
        Product product = new Product("Cola", 100);
        Product product2 = new Product("Crisps", 65);
        Drawer drawer = new Drawer(DrawerType.A1, product);
        Drawer drawer2 = new Drawer(DrawerType.A2, product2);
        vendingMachine.addDrawersToMachine(drawer);
        vendingMachine.addDrawersToMachine(drawer2);
    }

    @Test
    public void canAddDrawersToMachine() {
        assertEquals(2, vendingMachine.getNumberOfDrawers());
    }

    @Test
    public void canGetCostOfProduct() {
        assertEquals(65, vendingMachine.getProductCost("A2"));
    }
}
