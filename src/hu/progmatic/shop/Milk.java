package hu.progmatic.shop;

public class Milk extends Drink {

    private double fat;

    public Milk(){

    }

    public Milk(double quantity, String unitType, boolean isLongLife, int price, double fat) {
        super(quantity, unitType, isLongLife, price);
        this.fat = fat;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "\n=================" +
                "\nMilk" +
                "\nfat = " + fat +
                "\nquantity = " + quantity +
                "\nunitType = '" + unitType + '\'' +
                "\nisLongLife = " + isLongLife +
                "\nproduct category = " + category +
                "\nprice per litre = " + price +
                "\nprice = " + finalPrice;
    }
}
