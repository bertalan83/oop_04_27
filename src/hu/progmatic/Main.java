package hu.progmatic;

import hu.progmatic.shop.*;

public class Main {

      /*
      elelmiszerek:
           kenyer
           alma
           tej
           cukor
           sor
       vasarlo:
           vasarlo
               private Food[] cart;
               */


    public static void main(String[] args) {

    /*    Product food1 = new Product();
        Product food2 = new Product();

        Bread bread = new Bread();

        Milk milk = new Milk();

        System.out.println(milk.getFat());

        Product[] foods = {food1, food2, bread};

        System.out.println(food1.foodCounter);
        System.out.println(food2.foodCounter);
        System.out.println(Product.foodCounter);*/

        Avocado avocado = new Avocado(5, "each", false, 5, true);
        Beer beer = new Beer(8, "litre", true, 5, 8);
        Bread bread = new Bread(1, "kg", false, 1, true);
        Cereal cereal = new Cereal(3, "Box", true, 2, 0);
        Coke coke = new Coke(2, "litre", true, 4, false);
        Milk milk = new Milk(0.5, "litre", false, 2, 1.5);
        Water water = new Water(4, "litre", true, 1, false);

        Product[] cart1 = {
                avocado, bread, coke, milk, water
        };

        Product[] cart2 = {
                beer, bread, cereal, coke
        };

        Product[] cart3 = {
                avocado, water
        };


        Customer customer1 = new Customer();
        customer1.setCart(cart1);

        Customer customer2 = new Customer();
        customer2.setCart(cart2);

        Customer customer3 = new Customer();
        customer3.setCart(cart3);

        Object[] customers = {
                customer1,
                customer2,
                customer3
        };

        Object[] carts = {
                cart1,
                cart2,
                cart3
        };

        int counter = 0;

        for (Object customerss : customers) {
                counter++;
                System.out.println("\n" + counter + ". " + customerss);
            }

        }
    }
