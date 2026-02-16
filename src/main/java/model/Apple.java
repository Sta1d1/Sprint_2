package model;

import model.constants.Colour;
import model.constants.Discount;

import java.util.Objects;

public class Apple extends Food {
    protected String color;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    @Override
    public double getDiscount() {
        if (Objects.equals(this.color, Colour.RedApple)){
            return Discount.DiscountRedApple;
        } else if (Objects.equals(this.color, Colour.GreenApple)){
            return Discount.DiscountGreenApple;
        };
        return  0;
    }
}
