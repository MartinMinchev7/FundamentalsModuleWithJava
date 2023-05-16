package P01BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double priceForAllLightsabers = lightsabersPrice * (Math.ceil(countStudents * 1.1));
        double priceForAllRobes = robesPrice * countStudents;
        int freeBelts = countStudents / 6;
        double priceForAllBelts = beltsPrice * (countStudents - freeBelts);

        double sum = priceForAllBelts + priceForAllLightsabers + priceForAllRobes;
        double diff = sum - money;

        if (money >= sum) {
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }
    }
}
