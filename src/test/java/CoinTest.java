import VendingMachine.Product.Coin.Coin;
import VendingMachine.Product.Coin.CoinEnum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoinTest {

    private Coin coin;

    @Before

    public void setUp() {
        coin = new Coin(CoinEnum.TWENTY);
    }

    @Test
    public void hasValue() {
        assertEquals(20, coin.getValue());
    }

    @Test
    public void hasValidityTrue() {
        assertTrue(coin.getValidStatus());
    }

    @Test
    public void hasValidityFalse() {
        Coin coin = new Coin(CoinEnum.ONE);
        assertFalse(coin.getValidStatus());
    }
}
