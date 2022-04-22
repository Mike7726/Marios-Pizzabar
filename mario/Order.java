package mario;

import java.util.ArrayList;

public class Order {
    ArrayList<Pizza> orders = new ArrayList<>();
    ArrayList<ArrayList<Pizza>> current = new ArrayList<>();

    public void addPizzaToOrder(Pizza pizza) {
        orders.add(pizza);
    }

    public void currentOrder(ArrayList<Pizza> current) {
        current.addAll(orders);
    }

    public void printCurrentOrder(){
        for (int i = 0; i < current.size(); i++) {
            System.out.println(current.get(i));

        }
    }
}