package hu.progmatic.shop;

public class Beer extends Drink {

    private double alchololPercentage;

    public Beer() {

    }

    public Beer(double quantity, String unitType, boolean isLongLife, int price, double alchololPercentage) {
        super(quantity, unitType, isLongLife, price);
        this.alchololPercentage = alchololPercentage;
    }

    public double getAlchololPercentage() {
        return alchololPercentage;
    }

    public void setAlchololPercentage(double alchololPercentage) {
        this.alchololPercentage = alchololPercentage;
    }

    @Override
    public String toString() {
        return "\n=================" +
                "\nBeer" +
                "\nalchololPercentage = " + alchololPercentage +
                "\nquantity = " + quantity +
                "\nunitType = '" + unitType + '\'' +
                "\nisLongLife = " + isLongLife +
                "\nprice each = " + price +
                "\nprice = " + finalPrice;
    }
}
