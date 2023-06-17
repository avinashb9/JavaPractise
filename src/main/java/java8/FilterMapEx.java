package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapEx {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"Lenevo",25000f));
        productList.add(new Product(2,"Acer",10000f));
        productList.add(new Product(3,"HP",22000f));
        productList.add(new Product(4,"Dell",33000f));

        List<Float> priceProducts = productList.stream()
                .map(Product::getPrice)
                .filter(price -> price > 20000f)
                .toList();
        priceProducts.forEach(System.out::println);

    }
}
