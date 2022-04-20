package mario;

import java.util.Scanner;

public class Ui {
    Scanner in = new Scanner(System.in);
    Menu theMenu = new Menu();
    Order newOrder = new Order();

    public void userInput(){
        System.out.println("enter command: ");
        String command = in.nextLine();
        switch(command){
            case "m": printMenu();
            case "o": addToQueue();
        }
    }


    public void printMenu() {
        theMenu.printMenu();
    }

    public void addToQueue() {
        System.out.println("Enter pizza ID: ");
        int add = in.nextInt();
        switch (add){
            case 1:  newOrder.addPizza(theMenu.p1);

        }

        newOrder.addPizza(theMenu.p1);
        newOrder.addPizza(theMenu.p2);
        newOrder.addPizza(theMenu.p13);
        for (int i = 0; i < newOrder.orders.size(); i++)
            System.out.println(newOrder.orders.get(i));

    }
    public void printLastOrder() {

    }

    public void printQueue() {

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
