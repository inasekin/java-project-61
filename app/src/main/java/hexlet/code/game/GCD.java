package hexlet.code.game;

import hexlet.code.engine.Engine;
import hexlet.code.utils.Utils;

import static hexlet.code.utils.Utils.gcd;

public class GCD {
    public static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;

    public static void startGreatestCommonDivisorGame() {
        String[][] gcdData = new String[Engine.NUMBER_OF_ROUNDS_IN_GAME][Engine.NUMBER_OF_ELEMENTS_FOR_GAME_ARRAY];

        for (String[] round : gcdData) {
            int firstNumber = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            int secondNumber = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);

            round[Engine.QUESTION_INDEX_IN_ARRAY] = firstNumber + " " + secondNumber;
            round[Engine.CORRECT_ANSWER_INDEX_IN_ARRAY] = Integer.toString(gcd(firstNumber, secondNumber));
        }

        Engine.runGameProcess(RULES, gcdData);
    }
}
