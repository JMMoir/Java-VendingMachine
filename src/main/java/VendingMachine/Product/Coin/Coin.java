package VendingMachine.Product.Coin;

public class Coin {

    private CoinEnum coin;

    public Coin(CoinEnum coin) {
        this.coin = coin;
    }

    public int getValue(){
        return coin.getCoinValue();
    }

    public boolean getValidStatus() {
        return coin.getValid();
    }
}
