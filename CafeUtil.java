import java.util.ArrayList;
public class CafeUtil {
    public int getStreakGoal(){
        int totalDrinks = 0;
        for ( int i =0; i<=10;i++){
            totalDrinks += i;
            // System.out.println(i);
            // System.out.println(totalDrinks);
        }
        return totalDrinks;
    }
    public double getOrderTotal(double[] prices){
        // ArrayList<Double[]> lineItems = new ArrayList<Double[]>();
        // double[][] lineItems = new double[][]
        double lineItems[] = {3.5, 1.5, 4.0, 4.5};
        double sum = 0;
        for (double value : lineItems){
            sum += value;
            // System.out.println("value..." + value);
            // System.out.println("sum... " + sum);
        }
        // lineItems.sum();
        return sum;
    }
    public void displayMenu(ArrayList<String> menuItems){
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        String zero = menu.get(0);
        String one = menu.get(1);
        String two = menu.get(2);
        String three = menu.get(3);
        System.out.println("0 "+zero);
        System.out.println("1 "+one);
        System.out.println("2 "+two);
        System.out.println("3 "+three);
        // System.out.println(menu);
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Hello please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        // System.out.println(customers);
        System.out.println("There are " + customers.size() + " people ahead of you");
        customers.add( userName);
        System.out.println(customers);
    }
}
