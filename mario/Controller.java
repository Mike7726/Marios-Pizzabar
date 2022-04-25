package mario;

public class Controller {

    public static void main(String[] args) {
        Ui ui = new Ui();
        ui.commandHelp();
        POS pointOfSales = new POS();
        pointOfSales.commands();
       // while (true) { //make private + add getter
         //   ui.userInput();
        }
    }
}
