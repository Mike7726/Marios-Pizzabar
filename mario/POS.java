package mario;

import java.util.Scanner;

public class POS {
  Scanner in = new Scanner(System.in);
  Menu theMenu = new Menu();
  Order newOrder = new Order();
  FinishedOrders finished = new FinishedOrders();
  public boolean running = true;

  public void addToQueue() {
    boolean endOrder = false;
    System.out.println("Enter pizza ID: ");
    while (!endOrder) {
      String add = in.nextLine();
      if (add.equals("e")) {
        newOrder.currentOrder(newOrder.orders);
        newOrder.printCurrentOrder();
        endOrder = true;
      } else if (theMenu.menu.get(add) == null)
        System.out.println("Sorry, no such pizza exist");
      else {
        newOrder.addPizzaToOrder(theMenu.menu.get(add));
        printQueue();
      }
    }
  }

  public void printQueue() {
    System.out.println("Order queue: ");
    for (int i = 0; i < newOrder.orders.size(); i++)
      System.out.println(newOrder.orders.get(i));
  }

  public void printFinishedOrders() {
    int totalPrice = 0;
    System.out.println("Finished orders: ");
    for (int i = 0; i < finished.list.size(); i++) {
      System.out.println(finished.list.get(i));
    }
    for (int i = 0; i < finished.list.size(); i++) {
      totalPrice += finished.list.get(i).getPrice();
    }
    System.out.println("Total income: " + totalPrice + "\n");
  }

  public void endOrder() {
    // TODO: 22-04-2022 add if statement that checks if orders list is not empty 
    finished.addPizza(newOrder.orders.get(0));
    newOrder.orders.remove(0);
    printFinishedOrders();
        /*
        // tilføj fra queue til endofdetails liste med opsummering af cash
        // samleprisen
        int total = 0;
        for (int i = 0; i < newOrder.orders.size(); i++) {
            total += newOrder.orders.get(i).getPrice();

        }
        System.out.println(total);
        */
  }

  public void endOfDayDetails() {

  }
}
