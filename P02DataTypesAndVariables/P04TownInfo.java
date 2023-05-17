package P02DataTypesAndVariables;

import java.util.Scanner;

public class P04TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameTown = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        short area = scanner.nextShort();

        System.out.printf("Town %s has population of %d and area %d square km.", nameTown, population, area);
    }
}
