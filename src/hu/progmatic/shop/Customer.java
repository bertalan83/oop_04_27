package hu.progmatic.shop;

import java.util.Arrays;

public class Customer {

    private Product[] cart;

    public Customer() {
    }
    public Customer(Product[] cart) {
        this.cart = cart;
    }

    public Product[] getCart() {
        return cart;
    }

    public void setCart(Product[] cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return " Customer's" +
                "\ncart = " + Arrays.toString(cart);
    }
}
