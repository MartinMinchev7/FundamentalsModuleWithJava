package P02DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int n = Integer.parseInt(scanner.nextLine());

        int quantitiesSum = 0;
        for (int i = 1; i <= n; i++) {
            int quantities = Integer.parseInt(scanner.nextLine());

            if (capacity >= quantities) {
                capacity -= quantities;
                quantitiesSum += quantities;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }

        System.out.println(quantitiesSum);
    }
}
