package P01BasicSyntaxConditionalStatementsAndLoopsMoreExercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();


        double price = 0;
        double spendMoney = 0;
        while (!input.equals("Game Time")) {
            String gameName = input;

            if (balance <= 0) {
                System.out.println("Out of money!");
                break;
            }

            if (gameName.equals("OutFall 4")) {
                price = 39.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                } else {
                    balance = balance - price;
                    spendMoney += price;
                    System.out.println("Bought OutFall 4");
                }
            } else if (gameName.equals("CS: OG")) {
                price = 15.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                } else {
                    balance = balance - price;
                    spendMoney += price;
                    System.out.println("Bought CS: OG");
                }
            } else if (gameName.equals("Zplinter Zell")) {
                price = 19.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                } else {
                    balance = balance - price;
                    spendMoney += price;
                    System.out.println("Bought Zplinter Zell");
                }
            } else if (gameName.equals("Honored 2")) {
                price = 59.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                } else {
                    balance = balance - price;
                    spendMoney += price;
                    System.out.println("Bought Honored 2");
                }
            } else if (gameName.equals("RoverWatch")) {
                price = 29.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                } else {
                    balance = balance - price;
                    spendMoney += price;
                    System.out.println("Bought RoverWatch");
                }
            } else if (gameName.equals("RoverWatch Origins Edition")) {
                price = 39.99;
                if (balance < price) {
                    System.out.println("Too Expensive");
                } else {
                    balance = balance - price;
                    spendMoney += price;
                    System.out.println("Bought RoverWatch Origins Edition");
                }
            } else {
                System.out.println("Not Found");
            }
            input = scanner.nextLine();
        }

        if (balance >= 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spendMoney, balance);
        }
    }
}
