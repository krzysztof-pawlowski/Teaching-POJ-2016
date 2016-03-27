package pl.edu.pjwstk.poj.cart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof on 27/03/16.
 */
public class Cart {

    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        // we want products to be sorted by price all the time
        ProductManager.sortByPrice(products);

    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void applyVoucher(Product product) {
        double price = product.getPrice();
        product.setDiscountPrice(0.7 * price);
    }

    public void applyDiscountThirdForFree() {
        if (products.size() == 3) {
            Product cheapest = ProductManager.findCheapestProduct(products);
            cheapest.setDiscountPrice(0);
        }
    }

    public void applyDiscount300Plus() {
        if (getTotalPrice() > 300) {
            for (Product product : products) {
                double price = product.getPrice();
                product.setDiscountPrice(0.95 * price);
            }
        }
    }

    public void applyDiscount200Plus() {
        if (getTotalPrice() > 200) {
            Product product = new Product();
            product.setCode("mug001");
            product.setName("Company Mug");
            product.setPrice(0);
            products.add(product);
        }
    }

    public void printCart() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

}
