package mario;

public class Controller {

    public static void main(String[] args) {
        Ui ui = new Ui();
        while (ui.running) {
            ui.userInput();
        }
    }
}
