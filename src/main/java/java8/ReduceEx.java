package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceEx {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"Lenevo",25000f));
        productList.add(new Product(2,"Acer",10000f));
        productList.add(new Product(3,"HP",22000f));
        productList.add(new Product(4,"Dell",33000f));

        //reduce - accumulate operations
        Float totalPrice = productList.stream().map(Product::getPrice)
                .reduce(0.0f,(sum,getPrice)-> sum+getPrice);//accumulating price
        System.out.println(totalPrice);

        Float totalPrice1 = productList.stream().map(Product::getPrice)
                .reduce(Float::sum).get();
        System.out.println(totalPrice1);

        double totalPrice2 = productList.stream().collect(Collectors.summingDouble(Product::getPrice));
        double totalPrice3 = productList.stream().mapToDouble(Product::getPrice).sum();

    }
}
