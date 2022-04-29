package hu.progmatic.shop;

public class Food extends Product {

    public Food() {
    }

    public Food(double quantity, String unitType, int price) {
        super(quantity, unitType, price);
    }

    public Food(double quantity, String unitType, boolean isLongLife, int price) {
        super(quantity, unitType, isLongLife, price);
    }
}
