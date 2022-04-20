import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Pizza p1 = new Pizza(1,"Vesuvio",55);
        Pizza p2 = new Pizza(2,"Hawaii",55);
        Pizza p3 = new Pizza(3,"Vesuvio",55);
        Pizza p4 = new Pizza(4,"Vesuvio",55);


 Map<Integer, Pizza> menu = new HashMap<>();
        menu.put(p1.getID(), p1);
        System.out.println(menu.get(1));
    }


}
