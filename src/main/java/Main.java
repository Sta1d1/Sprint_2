import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED_APPLE);
        Apple greenApple = new Apple(8, 60, Colour.GREEN_APPLE);

        Food[] foods = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println("Полная цена продуктов в корзине: " + shoppingCart.getTotalWithoutDiscount());
        System.out.println("Цена продуктов в корзине со скидками: " + shoppingCart.getTotalWithDiscount());
        System.out.println("Цена только вегетарианских продуктов без скидок: " + shoppingCart.getTotalAmountAllVegetarianWithoutDiscounts());
    }
}
