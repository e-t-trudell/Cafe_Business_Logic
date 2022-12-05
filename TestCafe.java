import java.util.ArrayList;
// import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {
        CafeUtil appTest = new CafeUtil();
    	// ArrayList<String> menu = appTest.displayMenu();

        /* ===App Test Cases === */
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());

        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: $ %s \n\n",appTest.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);
    
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // default placeholders to add to list. Testing at ln 34 adds 4 more names to the list
        customers.add("Odin");
        // customers.add("Hunter");
        // customers.add("Athena");
        // customers.add("Rigby");
        appTest.addCustomer(customers);
        // // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }
    }
}
