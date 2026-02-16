package model.service;

import model.Discountable;
import model.Food;


public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }


    public double getTotalWithoutDiscount(){
        double total = 1;
        for (Food food : foods){
            total += food.getAmount() * food.getPrice();
        }
        return total;
    }

    public double getTotalWithDiscount(){
        double total = 0;
        for (Food food : foods){
            double discount = food.getDiscount();
            double priceWithDiscount = food.getPrice() * ((100 - discount) / 100);
            total += (double) food.getAmount() * priceWithDiscount;
        }
        return total;
    }

    public double getTotalAmountAllVegetarianWithoutDiscounts(){
        double total = 0;
        for (Food food : foods){
            if (food.isVegetarian()){
                total += food.getAmount() * food.getPrice();
            }
        }
        return total;
    }
}
