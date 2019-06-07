package VendingMachine.Product.Drawer;

import VendingMachine.Product.Product;

public class Drawer {

    private DrawerType code;
    private Product product;

    public Drawer(DrawerType code, Product product) {
        this.code = code;
        this.product = product;

    }

    public String getCode(){
        return code.name();
    }

    public String getProductName(){
        return product.getName();
    }

    public int getProductCost(){
        return product.getCost();
    }
}
