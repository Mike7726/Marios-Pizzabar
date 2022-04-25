package mario;

import java.util.Scanner;

public class Ui {
    Scanner in = new Scanner(System.in);
    Menu theMenu = new Menu();
    Order newOrder = new Order();
    FinishedOrders finished = new FinishedOrders();
    POS pointOfSale = new POS();
    public boolean running = true;

    public void userInput() {
        System.out.println("Enter command: ");
        String command = in.nextLine().toLowerCase();
        switch (command) {
            case "m", "menu" -> printMenu();
            case "o", "order" -> pointOfSale.addToQueue();
            case "q", "queue" -> pointOfSale.printQueue();
            case "e", "exit" -> running = false;
            case "d", "done" -> pointOfSale.endOrder();
            case "h", "help" -> commandHelp();
            case "f", "finished" -> pointOfSale.printFinishedOrders();
            default -> System.out.println("Sorry, Command not known. Try again: ");
        }
    }
    public void printMenu() {
        theMenu.printMenu();
    }

    public void commandHelp() {
        System.out.println(" M: See the menu" +
                "\n O: Add order" +
                "\n Q: See order queue" +
                "\n E: Exit" +
                "\n H: Get help" +
                "\n D: Mark next order as done" +
                "\n F: see list of finished orders" +
                "\n");

    }
    public void printLastOrder() {
    }
    public void endOfDayDetails() {
    }
}