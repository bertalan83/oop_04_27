package hu.progmatic.shop;

public class Drink extends Product {

    protected final String category = "drink";

    public Drink() {
    }

    public Drink(double quantity, String unitType, int price) {
        super(quantity, unitType, price);
    }

    public Drink(double quantity, String unitType, boolean isLongLife, int price) {
        super(quantity, unitType, isLongLife, price);
    }
}
