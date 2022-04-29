package hu.progmatic.shop;

public class Product {

    protected double quantity;
    protected String unitType ;
    protected boolean isLongLife;
    protected int price;
    protected double finalPrice;

    public Product() {
        setFinalPrice();
    }

    public Product(double quantity, String unitType, int price) {
        this.quantity = quantity;
        this.unitType = unitType;
        this.price = price;
        setFinalPrice();
    }

    public Product(double quantity, String unitType, boolean isLongLife, int price) {
        this(quantity, unitType, price);
        this.isLongLife = isLongLife;
        setFinalPrice();
    }

    public static void printInfo() {
        System.out.println("info");
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public boolean isLongLife() {
        return isLongLife;
    }

    public void setLongLife(boolean longLife) {
        isLongLife = longLife;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFinalPrice() {
        finalPrice = price * quantity;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    @Override
    public String toString() {
        return "\n=================" +
                "\nProduct " +
                "\nquantity = " + quantity +
                "\nunitType = '" + unitType + '\'' +
                "\nisLongLife=" + isLongLife +
                "\nprice = " + price;
    }
}
