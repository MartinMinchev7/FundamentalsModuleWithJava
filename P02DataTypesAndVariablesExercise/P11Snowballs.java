package P02DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int snowballSnowBiggest = 0;
        int snowballTimeBiggest = 0;
        int snowballQuantityBiggest = 0;
        double highestSnowballValue = Double.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuantity = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow * 1.0 / snowballTime, snowballQuantity);

            if (snowballValue > highestSnowballValue) {
                highestSnowballValue = snowballValue;
                snowballSnowBiggest = snowballSnow;
                snowballTimeBiggest = snowballTime;
                snowballQuantityBiggest = snowballQuantity;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowBiggest, snowballTimeBiggest, highestSnowballValue, snowballQuantityBiggest);
    }
}
