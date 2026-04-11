package Test;
// import chapter1.Toy;

import java.util.HashMap;
import java.util.Map;

public class UserTest {

    public static void main(String[] args) {
        // Toy toy1 = new Toy();
        // System.out.println(args[1]);
        Map<String,Integer> prices = new HashMap<>();
        System.out.println(prices.put("LPG", 1600));
        System.out.println(prices.put("Gas", 98));
        System.out.println(prices.put("LPG", 1600));
        System.out.println(prices.get("Gas"));
    }
    
}
