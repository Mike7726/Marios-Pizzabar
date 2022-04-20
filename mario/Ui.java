package mario;

public class Ui {
    Menu theMenu = new Menu();
    Order newOrder = new Order();


    public void printMenu() {
        theMenu.printMenu();
    }

    public void addToQueue() {
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

for (int i = 0; i < newOrder.orders.size(); i++){
 //total
//hvad med nu test
        }
    }
    public void endOfDayDetails() {

    }
}
