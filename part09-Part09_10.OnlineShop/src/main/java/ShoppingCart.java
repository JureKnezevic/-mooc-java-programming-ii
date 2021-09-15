
import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {

        this.cart = new HashMap<>();

    }

    public void add(String product, int price) {

        if (cart.containsKey(product)) {
            for (String products : cart.keySet()) {
                if (products.equals(product)) {
                    cart.get(products).increaseQuantity();
                    break;
                }
            }
        } else {
            Item item = new Item(product, 1, price);

            cart.put(product, item);

        }

    }

    public int price() {

        int price = 0;

        for (String products : cart.keySet()) {
            price = price + cart.get(products).price();
        }

        return price;
    }

    public void print() {

        for (String products : cart.keySet()) {
            System.out.println(cart.get(products).toString());
        }

    }

}
