import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Who are you?
        System.out.print("What is your name?: ");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();

        // List of customers
        ArrayList<String> customers = new ArrayList<>();
        customers.add("Nils LVL 2");
        customers.add("David LVL 1");
        customers.add("George LVL 3");
        customers.add("Ezekiel LVL 1");
        customers.add("Joe LVL 2");

        int lvl = 0;

        // For Loop / for customer list
        for (String customer : customers){
            if (customer.contains(name)){
                lvl = Integer.parseInt(customer.split(" ")[2]);
            }
        }

        // If Else Loop - if customer is available
        if(lvl == 0){
            System.out.println("ERROR - Customer not found");
            main(null);
        }

        // Amount (CHF)
        System.out.print("Enter the amount in CHF - of how much you went shopping today: ");
        Scanner scanner = new Scanner(System.in);
        float amount = Integer.parseInt(scanner.next());

        if (lvl == 1){
            float disc_five = amount - ((amount / 100) * 5);
            System.out.print("The end-result including the discount of 5% is: " + disc_five);
        } else if (lvl == 2){
            float disc_eight = amount - ((amount / 100) * 8);
            System.out.println("The end-result including the discount of 8% is: " + disc_eight);
        } else if (lvl == 3){
            float disc_twelve = amount - ((amount / 100) * 12);
            System.out.println("The end-result including the discount of 12% is: " + disc_twelve);
        }
    }
}