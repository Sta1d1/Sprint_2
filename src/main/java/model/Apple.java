package model;

import model.constants.Colour;
import model.constants.Discount;


public class Apple extends Food {
    protected String color;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    @Override
    public double getDiscount() {
        return Colour.RED_APPLE.equals(color) ? Discount.DISCOUNT_RED_APPLE : 0;
    }
}
