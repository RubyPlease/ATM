import com.sun.tools.javah.Util;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Please enter your name");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        //I need to determine if the user left this blank//
        if (name.isEmpty()) {
            throw new Exception();
        }else System.out.println("Welcome " + name);
        //This security is terrible//

        System.out.println("Please enter 1, 2, or 3 [1. Check Balance 2. Withdraw Funds 3. Cancel]");

        String selection = scanner.nextLine();

        //System.out.println("selection >" + selection.equals("1") +  "<");

        if (selection.equals("1")){
            System.out.println("Your balance is $100");
        }else if (selection.equals("3")) {
            System.out.println("Thank you. Please come again");
        }else if (selection.equals("2")) {
            System.out.println("Please enter amount to withdraw");
            int amount = scanner.nextInt();
            if (amount > 100) {
                System.out.println("Insufficient funds available");
                throw new Exception();
            }else if (amount < 0) {
                System.out.println("Please enter a positive amount");
                throw new Exception();
            }else {
                System.out.println("Please take your withdrawal. Come again");
            }
        }
        //I want it to loop back if they don't follow instructions. Will fix later
        else {
            System.out.println("Please enter 1, 2, or 3");
        }
    }
}
