package model.constants.service;

import model.Apple;
import model.Food;
import model.Meat;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }


    public double getTotalWithoutDiscount(){
        double total = 0;
        for (Food food : foods){
            total += (double) food.getAmount() * food.getPrice();
        }
        return total;
    }

//    public double getTotalWithDiscount(){
//        double total = 0;
//        for (Food food : foods){
//            total += (double) food.getAmount() * (food.getPrice() * food.);
//        }
//        return total;
//    }
//
//    public double getTotalAmountAllVegetarianWithoutDiscounts(){
//
//    }
}
