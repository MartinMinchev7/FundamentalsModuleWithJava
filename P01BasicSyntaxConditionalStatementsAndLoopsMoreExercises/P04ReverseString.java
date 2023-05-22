package P01BasicSyntaxConditionalStatementsAndLoopsMoreExercises;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reverseInput = "";

        for (int possition = input.length() - 1; possition >= 0; possition--) {

            char symbol = input.charAt(possition);
            reverseInput += symbol;
        }

        System.out.println(reverseInput);
    }
}
