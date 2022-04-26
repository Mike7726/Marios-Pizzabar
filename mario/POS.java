package mario;

import java.util.ArrayList;

public class POS {
  Ui ui = new Ui();
  Controller control = new Controller();
  Menu theMenu = new Menu();
  ArrayList<Pizza> ordersQueue = new ArrayList<>();
  ArrayList<Pizza> currentPizzaOrder = new ArrayList<>();
  ArrayList<ArrayList<Pizza>> currentOrder = new ArrayList<>();
  POS.FinishedOrders finished = new POS.FinishedOrders();

  public void commands() {
    while(control.getRunning()) {
      switch (ui.userInput()) {
        case "m", "menu" -> ui.printMenu();
        case "o", "order" -> addToQueue();
        case "q", "queue" -> printQueue();
        case "e", "exit" -> control.setRunning(false);
        case "d", "done" -> endOrder();
        case "h", "help" -> ui.commandHelp();
        case "f", "finished" -> printFinishedOrders();
        default -> System.out.println("Sorry, Command not known. Try again: ");
      }
      commands();
    }
  }


  public void addToQueue() {
    boolean endOrder = false;
    System.out.println("Enter pizza ID: ");
    while (!endOrder) {
      String add = ui.userInput();
      if (add.equals("e")) {
        currentOrder(currentPizzaOrder);
        printCurrentOrderPrice();
        currentPizzaOrder.clear();
        endOrder = true;
      } else if (theMenu.menu.get(add) == null)
        System.out.println("Sorry, no such pizza exist");
      else {
        addPizzaToOrderQueue(theMenu.menu.get(add));
        printQueue();
      }
    }
  }

  public void printQueue() {
    System.out.println("Order queue: ");
    for (int i = 0; i < ordersQueue.size(); i++)
      System.out.println(ordersQueue.get(i));
  }

  public void printFinishedOrders() {
    int totalPrice = 0;
    System.out.println("Finished orders: ");
    for (int i = 0; i < finished.finishedOrderList.size(); i++) {
      System.out.println(finished.finishedOrderList.get(i));
    }
    for (int i = 0; i < finished.finishedOrderList.size(); i++) {
      totalPrice += finished.finishedOrderList.get(i).getPrice();
    }
    System.out.println("Total income: " + totalPrice + "\n");
  }

  public void endOrder() {
    if (ordersQueue.size() != 0) {
      finished.addPizza(ordersQueue.get(0));
      ordersQueue.remove(0);
      printFinishedOrders();
    } else System.out.println("No pizza in queue");
  }

  public void endOfDayDetails() {
  }

  public void addPizzaToOrderQueue(Pizza pizza) {
    ordersQueue.add(pizza);
    currentPizzaOrder.add(pizza);
  }

  public void currentOrder(ArrayList<Pizza> a) {
    for(int i = 0; i < a.size(); i++) {
      a.get(i).printPizza();}

    currentOrder.clear();
  }

  public void printCurrentOrderPrice() {
    int total = 0;
    for (int i = 0; i < currentPizzaOrder.size(); i++)
      total += currentPizzaOrder.get(i).getPrice();
    System.out.println("Total Price: " + total);
  }

  public static class FinishedOrders {
    ArrayList<Pizza> finishedOrderList = new ArrayList<>();

    public void addPizza(Pizza pizza) {
      finishedOrderList.add(pizza);
    }
  }
}