package P01BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        String enterPass = scanner.nextLine();

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }

        int countIncorrectPass = 0;
        boolean isValid = true;

        while (!enterPass.equals(password)) {
            countIncorrectPass++;

            if (countIncorrectPass == 4) {
                System.out.printf("User %s blocked!%n", username);
                isValid = false;
                break;
            }

            System.out.println("Incorrect password. Try again.");

            enterPass = scanner.nextLine();
        }

        if (isValid) {
            System.out.printf("User %s logged in.%n", username);
        }
    }
}
