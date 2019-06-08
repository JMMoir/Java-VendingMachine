package VendingMachine;
import VendingMachine.Coin.Coin;
import VendingMachine.Drawer.Drawer;
import VendingMachine.Product.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Drawer> drawers;
    private ArrayList<Coin> cashBox;

    public VendingMachine(ArrayList<Drawer> drawers, ArrayList<Coin> cashBox) {
        this.drawers = drawers;
        this.cashBox = cashBox;
    }

    public int getNumberOfDrawers(){
        return drawers.size();
    }

    public void addDrawersToMachine(Drawer drawer){
        drawers.add(drawer);
    }

    public int getProductCost(String code) {
        int cost = 0;
        for(Drawer drawer: drawers){
            if(code.equals(drawer.getCode())){
                cost = drawer.getProductCost();
            }
        }
        return cost;
    }

//    can enter code to return product
    public Product getPoductByCode(String code){
        Product foundProduct = drawers.get(0).getProduct();

        for(Drawer drawer: drawers){
            if(code.equals(drawer.getCode())){
                foundProduct = drawer.getProduct();
            }
        }
        return foundProduct;
    }

    public int countCoinsInCashBox(){
        int total = 0;
        for(Coin coin: cashBox){
            total += coin.getValue();
        }
        return total;
    }


    public void insertCoin(Coin coin) {
        cashBox.add(coin);
    }

    public Product buyProduct(String code){
        Product product = null;
        if(countCoinsInCashBox() >= getProductCost(code)){
           product = getPoductByCode(code);
        }
        return product;
    }
}
