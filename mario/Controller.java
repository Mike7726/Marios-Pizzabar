package mario;

public class Controller {
   private boolean running = true;

   public boolean getRunning() {
   return this.running;
   }

    public void setRunning(boolean running){
    this.running = running;
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

