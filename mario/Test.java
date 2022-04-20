package mario;

public class Test {
    public static void main(String[] args) {

        Menu newmenu = new Menu();
        newmenu.printMenu();
        Ui newUi = new Ui();
        System.out.println();
        System.out.println();
        newUi.addToQueue();
        newUi.endOrder();

    }
}
