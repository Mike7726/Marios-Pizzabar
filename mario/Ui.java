package mario;

import java.util.Scanner;

public class Ui {
    Scanner in = new Scanner(System.in);
    Menu theMenu = new Menu();
    Order newOrder = new Order();
    public boolean running = true;

    public void userInput() {
        System.out.println("enter command: ");
        String command = in.nextLine().toLowerCase();
        switch (command) {
            case "m":
                printMenu();
                break;
            case "o":
                addToQueue();
                break;
            case "q":
                printQueue();
                break;
            case "e":
                running = false;
                break;
            case "h":
                commandHelp();
                break;
            default:
                System.out.println("Sorry, Command not known. Try again: ");
                break;
        }
    }


    public void printMenu() {
        theMenu.printMenu();
    }
    public void commandHelp(){
        System.out.println(" M: See the menu" +
                "\n O: Add order" +
                "\n Q: See order queue" +
                "\n E: Exit" +
                "\n H: Get help");

    }

    public void addToQueue() {
        System.out.println("Enter pizza ID: ");

        // TODO: 21/04/2022 Make sure only input is integers
        int add = in.nextInt();
        in.nextLine();
        if(add >= 1 && add < theMenu.menu.size()){
            newOrder.addPizza(theMenu.menu.get(add));
            printQueue();
        }
        else
            System.out.println("Sorry, no such pizza exists");
    }

    public void printLastOrder() {

    }

    public void printQueue() {
        for (int i = 0; i < newOrder.orders.size(); i++)
            System.out.println(newOrder.orders.get(i));
    }

    public void endOrder() {
        // tilføj fra queue til endofdetails liste med opsummering af cash
        // samleprisen
        int total = 0;
        for (int i = 0; i < newOrder.orders.size(); i++) {
            total += newOrder.orders.get(i).getPrice();

        }
        System.out.println(total);
    }

    public void endOfDayDetails() {

    }
}
