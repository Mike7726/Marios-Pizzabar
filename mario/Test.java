package mario;

public class Test {
    public static void main(String[] args) {

        Menu newmenu = new Menu();
        newmenu.printMenu();
        POS computer = new POS();
        System.out.println();
        System.out.println();
        computer.addToQueue();
        computer.endOrder();

    }
}
