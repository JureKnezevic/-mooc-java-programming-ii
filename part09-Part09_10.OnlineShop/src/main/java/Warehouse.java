
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jurek
 */
public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> count;

    public Warehouse() {

        this.prices = new HashMap<>();
        this.count = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {

        prices.put(product, price);
        count.put(product, stock);

    }

    public int price(String product) {

        for (String price : prices.keySet()) {
            if (price.equals(product)) {
                return prices.get(price);
            }
        }
        return -99;

    }

    public int stock(String product) {

        for (String stock : count.keySet()) {
            if (stock.equals(product)) {
                return count.get(stock);
            }
        }
        return 0;

    }

    public boolean take(String product) {

        int stockDecreased = 0;
        for (String stock : count.keySet()) {
            stockDecreased = count.get(stock);
            if (stock.equals(product)) {
                if (count.get(stock) > 0) {
                    stockDecreased = count.get(stock) - 1;
                    if (stockDecreased < 0) {
                        stockDecreased = 0;
                    }
                    count.put(stock, stockDecreased);

                    return true;

                }

            }
        }

        return false;
    }

    public Set<String> products() {
        Set<String> set = new HashSet<>();
        for (String stock : count.keySet()) {
            set.add(stock);

        }
        return set;

    }
}
