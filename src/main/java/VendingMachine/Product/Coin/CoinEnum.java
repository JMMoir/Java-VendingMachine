package VendingMachine.Product.Coin;

public enum CoinEnum {

    ONE(1, false),
    TWO(2, false),
    FIVE(5, true),
    TEN(10, true),
    TWENTY(20, true),
    FIFTY(50, true),
    ONEPOUND(100, true),
    TWOPOUND(200, true);


    private int value;
    private Boolean valid;

    CoinEnum(int value, Boolean valid) {
        this.value = value;
        this.valid = valid;
    }

    public int getCoinValue() {
        return value;
    }

    public Boolean getValid() {
        return valid;
    }
}
