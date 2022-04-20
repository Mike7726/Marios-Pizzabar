package mario;

import java.util.ArrayList;

public class Order {
    ArrayList<Pizza> orders = new ArrayList<>();

    public void addPizza(Pizza pizza){
        orders.add(pizza);
    }
}
