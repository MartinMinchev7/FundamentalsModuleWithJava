package P01BasicSyntaxConditionalStatementsAndLoopsExercise;

import org.w3c.dom.css.CSSStyleDeclaration;

import java.util.Scanner;

public class P08TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= n; rows++) {
            for (int times = 1; times <= rows; times++) {
                System.out.printf("%d ", rows);
            }
            System.out.println();
        }
    }
}
