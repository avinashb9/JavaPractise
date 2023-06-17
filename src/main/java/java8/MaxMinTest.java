package java8;

import java.util.ArrayList;
import java.util.List;

public class MaxMinTest {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"Lenevo",25000f));
        productList.add(new Product(2,"Acer",10000f));
        productList.add(new Product(3,"HP",22000f));
        productList.add(new Product(4,"Dell",33000f));

        Float maxPrice = productList.stream().max((p1,p2)-> p1.getPrice() > p2.getPrice() ? 1:-1).get().getPrice();
        System.out.println(maxPrice);

        Float minPrice = productList.stream().min((p1,p2)-> p1.getPrice() < p2.getPrice() ? -1:1).get().getPrice();
        System.out.println(minPrice);

    }
}
