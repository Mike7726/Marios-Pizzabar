package mario;

public class Controller {
   private boolean running = true;

   public void getRunning() {
   running = this.running;
   }

    public boolean setRunning(boolean running){
    return running;
   }

    public static void main(String[] args) {
        Ui ui = new Ui();
        ui.commandHelp();
        POS pointOfSales = new POS();
        pointOfSales.commands();
       // while (true) { //make private + add getter
         //   ui.userInput();
        }
    }

