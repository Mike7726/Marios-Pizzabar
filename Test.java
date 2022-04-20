import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Pizza p = new Pizza("2","Vesuvio",55);

        Map<String, Pizza> menu = new HashMap<>();
        menu.put(p.getID(), p);
    }
}
