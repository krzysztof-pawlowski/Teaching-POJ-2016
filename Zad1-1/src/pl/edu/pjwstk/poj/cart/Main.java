package pl.edu.pjwstk.poj.cart;

/**
 * Created by Krzysztof on 27/03/16.
 */
public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setCode("code1");
        product1.setName("product1");
        product1.setPrice(101);

        Product product2 = new Product("code2", "product2", 200);

        Product product3 = new Product();
        product3.setCode("code3");
        product3.setName("product3");
        product3.setPrice(500);

        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        cart.printCart();

        System.out.println("After discount: ");

        cart.applyDiscount200Plus();

        cart.printCart();

    }
}
