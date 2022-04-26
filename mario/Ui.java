package mario;

import java.util.Scanner;

public class Ui {
    Scanner in = new Scanner(System.in);
    Menu theMenu = new Menu();

    public String userInput() {
        System.out.println("Enter command: ");
        return in.nextLine().toLowerCase();
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