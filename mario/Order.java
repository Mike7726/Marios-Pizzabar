package mario;

import java.util.ArrayList;

public class Order {
    ArrayList<Pizza> orders = new ArrayList<>();
    ArrayList<ArrayList<Pizza>> current = new ArrayList<>();

    public void addPizzaToOrder(Pizza pizza) {
        orders.add(pizza);
    }

    public void currentOrder(ArrayList<Pizza> a) {
        current.add(orders);
        String endOfOrder = current.toString().replace("[","")
                .replace("]","").replace(",","\n").trim();
        System.out.println(endOfOrder);
        current.clear();
    }
    public void printCurrentOrderPrice() {
        int total = 0;
        for (int i = 0; i < orders.size(); i++)
            total += orders.get(i).getPrice();
        System.out.println("Total Price: " + total);
    }
}