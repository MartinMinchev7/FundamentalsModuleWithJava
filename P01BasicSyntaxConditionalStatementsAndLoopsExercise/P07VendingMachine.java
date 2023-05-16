package P01BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalMoney = 0;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);

            if (coins == 0.1) {
                totalMoney += coins;
            } else if (coins == 0.2) {
                totalMoney += coins;
            }  else if (coins == 0.5) {
                totalMoney += coins;
            }  else if (coins == 1) {
                totalMoney += coins;
            }  else if (coins == 2) {
                totalMoney += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            input = scanner.nextLine();
        }

        String input2 = scanner.nextLine();

        while (!input2.equals("End")) {
            String product = input2;

            if (product.equals("Nuts")) {
                if (totalMoney >= 2) {
                    System.out.printf("Purchased %s%n", product);
                    totalMoney -= 2;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Water")) {
                if (totalMoney >= 0.7) {
                    System.out.printf("Purchased %s%n", product);
                    totalMoney -= 0.7;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Crisps")) {
                if (totalMoney >= 1.5) {
                    System.out.printf("Purchased %s%n", product);
                    totalMoney -= 1.5;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Soda")) {
                if (totalMoney >= 0.8) {
                    System.out.printf("Purchased %s%n", product);
                    totalMoney -= 0.8;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Coke")) {
                if (totalMoney >= 1) {
                    System.out.printf("Purchased %s%n", product);
                    totalMoney -= 1;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }

            input2 = scanner.nextLine();
        }

        System.out.printf("Change: %.2f%n", totalMoney);
    }
}
