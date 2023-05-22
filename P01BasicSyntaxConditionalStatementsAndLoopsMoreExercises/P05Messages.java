package P01BasicSyntaxConditionalStatementsAndLoopsMoreExercises;

import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = "";

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            int currentNum = num;
            int countDigits = 0;
            int mainDigit = 0;

            while (currentNum > 0) {
                int lastDigit = currentNum % 10;
                mainDigit = lastDigit;
                countDigits++;
                currentNum = currentNum / 10;
            }
            switch (mainDigit) {
                case 2:
                    if (countDigits == 1) {
                        input += "a";
                    } else if (countDigits == 2) {
                        input += "b";
                    } else if (countDigits == 3) {
                        input += "c";
                    }
                    break;
                case 3:
                    if (countDigits == 1) {
                        input += "d";
                    } else if (countDigits == 2) {
                        input += "e";
                    } else if (countDigits == 3) {
                        input += "f";
                    }
                    break;
                case 4:
                    if (countDigits == 1) {
                        input += "g";
                    } else if (countDigits == 2) {
                        input += "h";
                    } else if (countDigits == 3) {
                        input += "i";
                    }
                    break;
                case 5:
                    if (countDigits == 1) {
                        input += "j";
                    } else if (countDigits == 2) {
                        input += "k";
                    } else if (countDigits == 3) {
                        input += "l";
                    }
                    break;
                case 6:
                    if (countDigits == 1) {
                        input += "m";
                    } else if (countDigits == 2) {
                        input += "n";
                    } else if (countDigits == 3) {
                        input += "o";
                    }
                    break;
                case 7:
                    if (countDigits == 1) {
                        input += "p";
                    } else if (countDigits == 2) {
                        input += "q";
                    } else if (countDigits == 3) {
                        input += "r";
                    } else if (countDigits == 4) {
                        input += "s";
                    }
                    break;
                case 8:
                    if (countDigits == 1) {
                        input += "t";
                    } else if (countDigits == 2) {
                        input += "u";
                    } else if (countDigits == 3) {
                        input += "v";
                    }
                    break;
                case 9:
                    if (countDigits == 1) {
                        input += "w";
                    } else if (countDigits == 2) {
                        input += "x";
                    } else if (countDigits == 3) {
                        input += "y";
                    } else if (countDigits == 4) {
                        input += "z";
                    }
                    break;
                case 0:
                    input += " ";
                    break;
            }

        }
        System.out.printf("%s", input);
    }
}
