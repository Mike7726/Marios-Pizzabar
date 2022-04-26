package mario;

public class Controller {
    private boolean running = true;
    public boolean getRunning() {
        return this.running;
    }
    public void setRunning(boolean running) {
        this.running = running;
    }
    public static void main(String[] args) {

        POS pointOfSales = new POS();
        pointOfSales.ui.commandHelp();
        pointOfSales.commands();
    }
}

