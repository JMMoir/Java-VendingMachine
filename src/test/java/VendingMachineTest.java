import VendingMachine.Coin.Coin;
import VendingMachine.Drawer.Drawer;
import VendingMachine.Drawer.DrawerType;
import VendingMachine.Product.Product;
import VendingMachine.VendingMachine;
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
        ArrayList<Coin> cashBox = new ArrayList<Coin>();
        vendingMachine = new VendingMachine(drawers, cashBox);
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

    @Test
    public void canCountCoins() {
        assertEquals(0, vendingMachine.countCoinsInCashBox());
    }


}
