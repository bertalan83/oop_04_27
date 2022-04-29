package hu.progmatic.shop;

public class Coke extends Drink {

    private boolean isZero;

    public Coke() {
    }

    public Coke(double quantity, String unitType, boolean isLongLife, int price, boolean isZero) {
        super(quantity, unitType, isLongLife, price);
        this.isZero = isZero;
    }

    public boolean isZero() {
        return isZero;
    }

    public void setZero(boolean zero) {
        isZero = zero;
    }

    @Override
    public String toString() {
        return "\n=================" +
                "\nCoke" +
                "\nisZero = " + isZero +
                "\nquantity = " + quantity +
                "\nunitType = '" + unitType + '\'' +
                "\nisLongLife = " + isLongLife +
                "\nprice per litre = " + price +
                "\nprice = " + finalPrice;
    }
}
