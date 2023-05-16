package P01BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String typeDay = scanner.nextLine();

        double price = 0;
        double totalPrice = 0;
        if (typeOfGroup.equals("Students")) {
            if (typeDay.equals("Friday")) {
                price = 8.45;
            } else if (typeDay.equals("Saturday")) {
                price = 9.80;
            } else if (typeDay.equals("Sunday")) {
                price = 10.46;
            }
            totalPrice = price * amountPeople;

            if (amountPeople >= 30) {
                totalPrice = totalPrice * 0.85;
            }
        } else if (typeOfGroup.equals("Business")) {
            if (typeDay.equals("Friday")) {
                price = 10.90;
            } else if (typeDay.equals("Saturday")) {
                price = 15.60;
            } else if (typeDay.equals("Sunday")) {
                price = 16;
            }
            totalPrice = price * amountPeople;

            if (amountPeople >= 100) {
                totalPrice = totalPrice - (10 * price);
            }
        } else if (typeOfGroup.equals("Regular")) {
            if (typeDay.equals("Friday")) {
                price = 15;
            } else if (typeDay.equals("Saturday")) {
                price = 20;
            } else if (typeDay.equals("Sunday")) {
                price = 22.50;
            }
            totalPrice = price * amountPeople;

            if (amountPeople >= 10 && amountPeople <= 20) {
                totalPrice = totalPrice * 0.95;
            }
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
