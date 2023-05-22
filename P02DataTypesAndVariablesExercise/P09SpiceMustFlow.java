package P02DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int leftSpice = 0;
        int daysOperated = 0;
        while (startingYield >= 100) {

            leftSpice = leftSpice + (startingYield - 26);
            daysOperated++;
            startingYield = startingYield - 10;
        }

        if (leftSpice >= 26) {
            leftSpice -= 26;
        }

        System.out.println(daysOperated);
        System.out.println(leftSpice);
    }
}
