package P02DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int startingPower = power;
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());

        int pokedCounter = 0;
        while (power >= distance) {
            power -= distance;
            pokedCounter++;

            if (power == startingPower / 2 && factor != 0) {
                power /= factor;
            }
        }
        System.out.println(power);
        System.out.println(pokedCounter);
    }
}
