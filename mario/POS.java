package mario;

import java.util.ArrayList;
import java.util.Scanner;

public class POS {
 //   Scanner in = new Scanner(System.in);
    Ui ui = new Ui();
    Controller control = new Controller();
    Menu theMenu = new Menu();
    POS.Order newOrder = new POS.Order();
    POS.FinishedOrders finished = new POS.FinishedOrders();

    public void commands(){
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


    public void addToQueue() {
        boolean endOrder = false;
        System.out.println("Enter pizza ID: ");
        while (!endOrder) {
            String add = ui.userInput();
            if (add.equals("e")) {
                newOrder.currentOrder(newOrder.orders);
                newOrder.printCurrentOrderPrice();
                newOrder.current.clear();
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
        if (newOrder.orders.size() != 0) {
            finished.addPizza(newOrder.orders.get(0));
            newOrder.orders.remove(0);
            printFinishedOrders();
        } else System.out.println("No pizza in queue");
    }

    public void endOfDayDetails() {
    }

    ////////////////////////////////////////
    public static class Order {
        ArrayList<Pizza> orders = new ArrayList<>();
        ArrayList<ArrayList<Pizza>> current = new ArrayList<>();

        public void addPizzaToOrder(Pizza pizza) {
            orders.add(pizza);
        }

        public void currentOrder(ArrayList<Pizza> a) {
            current.add(orders);
            String endOfOrder = current.toString().replace("[", "")
                    .replace("]", "").replace(",", "\n").trim();
            System.out.println(endOfOrder);
        }

        public void printCurrentOrderPrice() {
            int total = 0;
            for (int i = 0; i < orders.size(); i++)
                total += orders.get(i).getPrice();
            System.out.println("Total Price: " + total);
        }
    }

    //////////////////////////////////////////////////////
    public static class FinishedOrders {
        ArrayList<Pizza> list = new ArrayList<>();

        public void addPizza(Pizza pizza) {
            list.add(pizza);
        }
    }

}
