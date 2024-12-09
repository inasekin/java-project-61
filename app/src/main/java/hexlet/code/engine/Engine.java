package hexlet.code.engine;

import java.util.Scanner;

public class Engine {
    public static final int QUESTION_INDEX_IN_ARRAY = 0;
    public static final int CORRECT_ANSWER_INDEX_IN_ARRAY = 1;
    public static final int NUMBER_OF_ROUNDS_IN_GAME = 3;
    public static final int NUMBER_OF_ELEMENTS_FOR_GAME_ARRAY = 2;

    private static final Scanner SCANNER = new Scanner(System.in);

    public static Scanner getScanner() {
        return SCANNER;
    }

    public static void runGameProcess(String rules, String[][] gameData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = SCANNER.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        for (String[] round : gameData) {
            System.out.println("Question: " + round[QUESTION_INDEX_IN_ARRAY]);
            System.out.print("Your answer: ");
            String userAnswer = SCANNER.next();

            if (userAnswer.equals(round[CORRECT_ANSWER_INDEX_IN_ARRAY])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + round[CORRECT_ANSWER_INDEX_IN_ARRAY] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
