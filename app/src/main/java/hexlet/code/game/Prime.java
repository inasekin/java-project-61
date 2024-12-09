package hexlet.code.game;

import hexlet.code.engine.Engine;
import hexlet.code.utils.Utils;

import static hexlet.code.utils.Utils.isPrime;

public class Prime {
    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_VALUE = 2;
    private static final int MAX_VALUE = 100;

    public static void startPrimeGame() {
        String[][] primeData = new String[Engine.NUMBER_OF_ROUNDS_IN_GAME][Engine.NUMBER_OF_ELEMENTS_FOR_GAME_ARRAY];

        for (String[] round : primeData) {
            int question = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            String correctAnswer = isPrime(question) ? "yes" : "no";

            round[Engine.QUESTION_INDEX_IN_ARRAY] = Integer.toString(question);
            round[Engine.CORRECT_ANSWER_INDEX_IN_ARRAY] = correctAnswer;
        }

        Engine.runGameProcess(RULES, primeData);
    }
}
