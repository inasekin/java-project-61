package hexlet.code;

import java.util.Scanner;
import hexlet.code.game.Even;
import hexlet.code.game.Calculator;
import hexlet.code.game.GCD;
import hexlet.code.game.Progression;
import hexlet.code.game.Prime;

public class Cli {
    private static String userName;

    public static void getName() {
        System.out.println("Welcome to the Brain Games!");

        if (userName == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("May I have your name? ");
            userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
        } else {
            System.out.println("Hello again, " + userName + "!");
        }

    }

    public static void initApp() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calculator\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        System.out.println();

        switch (userChoice) {
            case "0" -> System.out.println("See you next time!");
            case "1" -> getName();
            case "2" -> Even.startEvenGame();
            case "3" -> Calculator.startCalculatorGame();
            case "4" -> GCD.startGreatestCommonDivisorGame();
            case "5" -> Progression.startProgressionGame();
            case "6" -> Prime.startPrimeGame();
            default -> System.out.println("You entered the wrong number.");
        }
    }
}
