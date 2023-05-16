package P01BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOrders = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double totalPrice = 0;
        for (int i = 1; i <= countOrders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            price = (days * capsulesCount) * pricePerCapsule;
            totalPrice += price;

            System.out.printf("The price for the coffee is: $%.2f%n", price);
        }

        System.out.printf("Total: $%.2f%n", totalPrice);
    }
}
