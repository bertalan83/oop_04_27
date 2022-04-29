package hu.progmatic.shop;

public class Bread extends Food {

    private boolean isWhite;

    public Bread() {
    }

    public Bread(double quantity, String unitType, boolean isLongLife, int price, boolean isWhite) {
        super(quantity, unitType, isLongLife, price);
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    /*public void increasedPrice() {
        price = price + 1;
       // setPrice(getPrice() + 1);
    }*/

    @Override
    public String toString() {
        return "\n=================" +
                "\nBread" +
                "\nisWhite = " + isWhite +
                "\nquantity = " + quantity +
                "\nunitType = '" + unitType + '\'' +
                "\nisLongLife = " + isLongLife +
                "\nproduct category = " + category +
                "\nprice per kg = " + price +
                "\nprice = " + finalPrice;
    }
}
