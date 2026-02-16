package model;

import model.constants.Colour;
import model.constants.Discount;

import java.util.Objects;

public class Apple extends Food implements Discountable{
    protected String color;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    @Override
    public double getDiscount() {
        if (Objects.equals(this.color, Colour.redApple)){
            return Discount.discount;
        };
        return  0;
    }
}
