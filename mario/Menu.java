package mario;

import java.util.HashMap;
import java.util.Map;

public class Menu {
        Map<Integer, Pizza> menu = new HashMap<>();
    Pizza p1 = new Pizza(1, "Margarita", 55);
    Pizza p2 = new Pizza(2, "Pepperoni", 55);
    Pizza p3 = new Pizza(3, "Hawaii", 55);
    Pizza p4 = new Pizza(4, "Mascarpone", 55);
    Pizza p5 = new Pizza(5, "Vesuvio", 55);
    Pizza p6 = new Pizza(6, "Amerikaner", 57);
    Pizza p7 = new Pizza(7, "Capricciosa", 57);
    Pizza p8 = new Pizza(8, "La Blissola", 57);
    Pizza p9 = new Pizza(9, "Venezia", 57);
    Pizza p10 = new Pizza(10, "Mafia", 57);
    Pizza p11 = new Pizza(11, "Victoria", 61);
    Pizza p12 = new Pizza(12, "Silvia", 61);
    Pizza p13 = new Pizza(13, "Dennis", 61);
    Pizza p14 = new Pizza(14, "Carbona", 61);
    Pizza p15 = new Pizza(15, "Cacciatore", 61);

    public Menu(){
        menu.put(p1.getID(), p1);
        menu.put(p2.getID(), p2);
        menu.put(p3.getID(), p3);
        menu.put(p4.getID(), p4);
        menu.put(p5.getID(), p5);
        menu.put(p6.getID(), p6);
        menu.put(p7.getID(), p7);
        menu.put(p8.getID(), p8);
        menu.put(p9.getID(), p9);
        menu.put(p10.getID(), p10);
        menu.put(p11.getID(), p11);
        menu.put(p12.getID(), p12);
        menu.put(p13.getID(), p13);
        menu.put(p14.getID(), p14);
        menu.put(p15.getID(), p15);
    }

    public void printMenu() {

        for (int i = 1; i < menu.size()+1; i++) {
            System.out.println(menu.get(i));
        }

    }


}

