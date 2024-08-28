package ru.gb.vending;

import ru.gb.vending.product.Bottle;
import ru.gb.vending.product.HotTea;
import ru.gb.vending.product.Product;
import ru.gb.vending.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Product product1 = new Product();//разные методы конструкторы позволяют по разному внести продукт
        product1.setName("twix");
        product1.setPrice(100);
        Product product2 = new Bottle("coca", 150, 2.5);
        Product product3 = new Product("snikers", 200);
        Product product4 = new HotTea("tea", 250 , 0.3, 95 );

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);
        vendingMachine.addProduct(product4);

        //System.out.println(product1.getName() + " " + product1.getPrice());
        //System.out.println(product2);
        System.out.println(vendingMachine);

        //System.out.println(product2);

    }
}
