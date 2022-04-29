package hu.progmatic.shop;

public class Cereal extends Food {

    private double sugar;

    public Cereal() {

    }

    public Cereal(double quantity, String unitType, boolean isLongLife, int price, double sugar) {
        super(quantity, unitType, isLongLife, price);
        this.sugar = sugar;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "\n=================" +
                "\nCereal" +
                "\nsugar = " + sugar +
                "\nquantity = " + quantity +
                "\nunitType = '" + unitType + '\'' +
                "\nisLongLife = " + isLongLife +
                "\nprice each = " + price +
                "\nprice = " + finalPrice;
    }
}
