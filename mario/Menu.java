package mario;

import java.util.HashMap;
import java.util.Map;

public class Menu {
  public Menu() {
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

  Map<String, Pizza> menu = new HashMap<>();
  Pizza p1 = new Pizza("1", "Margarita: Tomatsauce, ost og oregano", 55);
  Pizza p2 = new Pizza("2", "Amerikaner: Tomatsauce, ost, oksefars og oregano", 55);
  Pizza p3 = new Pizza("3", "Cacciatore: Tomatsauce, ost, pepperoni og oregano ", 55);
  Pizza p4 = new Pizza("4", "Carbona: Tomatsauce, ost, kødsauce, spaghetti og cocktailpølser", 55);
  Pizza p5 = new Pizza("5", "Dennis: Tomatsauce, ost, skinke, pepperoni og oregano", 55);
  Pizza p6 = new Pizza("6", "Bertil: Tomatsauce, ost, bacon og oregano", 57);
  Pizza p7 = new Pizza("7", "Silvia: Tomatsauce, ost, pepperoni, rødpeber, løg og oliven", 57);
  Pizza p8 = new Pizza("8", "Victoria: Tomatsauce, ost, skinke, ananas, champignon, løg og oregano", 57);
  Pizza p9 = new Pizza("9", "Toronfo: Tomatsauce, ost, skinke, bacon, kebab, chili og oregano", 57);
  Pizza p10 = new Pizza("10", "Capricciosa: Tomatsauce, ost, skinke, champignon og oregano", 57);
  Pizza p11 = new Pizza("11", "Hawaii: Tomatsauce, ost, skinke, ananas og oregano", 61);
  Pizza p12 = new Pizza("12", "La Blissola: Tomatsauce, ost, skinke, rejer og oregano", 61);
  Pizza p13 = new Pizza("13", "Venezia: Tomatsauce, ost, skinke, bacon og oregano", 61);
  Pizza p14 = new Pizza("14", "Mafia: Tomatsauce, ost, pepperoni, bacon, løg og oregano", 61);
  Pizza p15 = new Pizza("15", "Salatpizza: Tomatsauce, ost, salat, kebab, dressing og oregano", 61);


  public void printMenu() {
    for (int i = 1; i < menu.size() + 1; i++) {
      System.out.println(menu.get(String.valueOf(i)));
    }
  }
}


