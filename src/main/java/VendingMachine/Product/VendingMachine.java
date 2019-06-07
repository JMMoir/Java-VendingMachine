package VendingMachine.Product;

import VendingMachine.Product.Drawer.Drawer;

import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Drawer> drawers;


    public VendingMachine(ArrayList<Drawer> drawers) {
        this.drawers = drawers;
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
}
