package hu.progmatic.shop;

public class Water extends Drink {

    private boolean isSparkling;

    public Water() {
    }

    public Water(double quantity, String unitType, boolean isLongLife, int price, boolean isSparkling) {
        super(quantity, unitType, isLongLife, price);
        this.isSparkling = isSparkling;
    }

    public boolean isSparkling() {
        return isSparkling;
    }

    public void setSparkling(boolean sparkling) {
        isSparkling = sparkling;
    }

    @Override
    public String toString() {
        return "\n=================" +
                "\nWater" +
                "\nisSparkling = " + isSparkling +
                "\nquantity = " + quantity +
                "\nunitType = '" + unitType + '\'' +
                "\nisLongLife = " + isLongLife +
                "\nproduct category = " + category +
                "\nprice per litre = " + price +
                "\nprice = " + finalPrice;
    }
}
