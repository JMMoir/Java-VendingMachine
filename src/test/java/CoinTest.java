import Coin.Coin;
import Coin.CoinEnum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
