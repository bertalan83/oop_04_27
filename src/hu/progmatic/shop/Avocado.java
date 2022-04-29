package hu.progmatic.shop;

public class Avocado extends Food {

    private boolean isRipe;

    public Avocado() {
    }

    public Avocado(double quantity, String unitType, boolean isLongLife, int price, boolean isRipe) {
        super(quantity, unitType, isLongLife, price);
        this.isRipe = isRipe;
    }

    public boolean isRipe() {
        return isRipe;
    }

    public void setRipe(boolean ripe) {
        isRipe = ripe;
    }

    @Override
    public String toString() {
        return "\n=================" +
                "\nAvocado" +
                "\nisRipe = " + isRipe +
                "\nquantity = " + quantity +
                "\nunitType = '" + unitType + '\'' +
                "\nisLongLife = " + isLongLife +
                "\nproduct category = " + category +
                "\nprice each = " + price +
                "\nprice = " + finalPrice;
    }
}
