package P01BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int brokenHeadsetCount = lostGamesCount / 2;
        int brokenMouseCount = lostGamesCount / 3;
        int brokenKeyboardCount = lostGamesCount / 6;
        int brokenDisplayCount = lostGamesCount / 12;

        double expenses = (headsetPrice * brokenHeadsetCount) + (mousePrice * brokenMouseCount) + (keyboardPrice * brokenKeyboardCount) + (displayPrice * brokenDisplayCount);
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
