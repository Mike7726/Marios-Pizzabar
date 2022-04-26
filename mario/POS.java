package mario;

import java.util.ArrayList;

public class POS {
    Ui ui = new Ui();
    Controller control = new Controller();
    Menu theMenu = new Menu();
    private ArrayList<Pizza> ordersQueue = new ArrayList<>();
    private ArrayList<Pizza> currentPizzaOrder = new ArrayList<>();
    private ArrayList<ArrayList<Pizza>> currentOrder = new ArrayList<>();
    POS.FinishedOrders finished = new POS.FinishedOrders();
    Date date = new Date();
    Timestamp ts = new Timestamp(date.getTime());
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");

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


  private void addToQueue() {
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

    private void printQueue() {
        System.out.println("Order queue: ");
        for (int i = 0; i < ordersQueue.size(); i++)
            System.out.println(ordersQueue.get(i).toString() + "\n" + formatter.format(ts));
    }

  private void printFinishedOrders() {
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

  private void endOrder() {
    if (ordersQueue.size() != 0) {
      finished.addPizza(ordersQueue.get(0));
      ordersQueue.remove(0);
      printFinishedOrders();
    } else System.out.println("No pizza in queue");
  }

  public void endOfDayDetails() {
  }

  private void addPizzaToOrderQueue(Pizza pizza) {
    ordersQueue.add(pizza);
    currentPizzaOrder.add(pizza);
  }

  private void currentOrder(ArrayList<Pizza> a) {
    for(int i = 0; i < a.size(); i++) {
      a.get(i).printPizza();}

    currentOrder.clear();
  }

  private void printCurrentOrderPrice() {
    int total = 0;
    for (int i = 0; i < currentPizzaOrder.size(); i++)
      total += currentPizzaOrder.get(i).getPrice();
    System.out.println("\nTotal Price: " + total);
  }

  private static class FinishedOrders {
    ArrayList<Pizza> finishedOrderList = new ArrayList<>();

    private void addPizza(Pizza pizza) {
      finishedOrderList.add(pizza);
    }
  }
}