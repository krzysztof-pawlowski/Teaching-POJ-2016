package pl.edu.pjwstk.poj.cart;

import java.util.List;

/**
 * Created by Krzysztof on 27/03/16.
 */
public class ProductManager {
    public static Product findMostExpensiveProduct(List<Product> products) {
        if (products == null || products.size() == 0) {
            return null;
        }
        Product mostExpensive = products.get(0);
        for (int i = 1; i < products.size(); ++i) {
            if (mostExpensive.getPrice() < products.get(i).getPrice()) {
                mostExpensive = products.get(i);
            }
        }
        return mostExpensive;
    }

    public static Product findCheapestProduct(List<Product> products) {
        if (products == null || products.size() == 0) {
            return null;
        }
        Product cheapest = products.get(0);
        for (int i = 1; i < products.size(); ++i) {
            if (cheapest.getPrice() > products.get(i).getPrice()) {
                cheapest = products.get(i);
            }
        }
        return cheapest;
    }

    public static void sortByPrice(List<Product> products) {
        for (int i = 0; i < products.size() - 2; ++i) {
            for (int j = products.size() - 1; j > i; --j ) {
                if (products.get(j - 1).getPrice() > products.get(j).getPrice()) {
                    Product tmp = products.get(j - 1);
                    products.set(j - 1,  products.get(j));
                    products.set(j, tmp);
                }
            }
        }
    }


}
