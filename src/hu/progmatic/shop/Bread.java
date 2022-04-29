package hu.progmatic.shop;

// gyerekosztaly / szarmaztatott osztaly
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
                "\nquantity = " + quantity +
                "\nunitType = '" + unitType + '\'' +
                "\nisLongLife = " + isLongLife +
                "\nprice per kg = " + price +
                "\nprice = " + finalPrice;
    }
}
