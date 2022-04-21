package mario;

import java.util.ArrayList;

public class Order {
    ArrayList<Pizza> orders = new ArrayList<>();
    ArrayList<ArrayList<Pizza>> current = new ArrayList<>();

    public void addPizza(Pizza pizza) {
        orders.add(pizza);
    }

    public void currentOrder(ArrayList<Pizza> current) {
        current.addAll(orders);
    }
}
