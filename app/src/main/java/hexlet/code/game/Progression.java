package hexlet.code.game;

import hexlet.code.engine.Engine;
import hexlet.code.utils.Utils;

public class Progression {
    public static final String RULES = "What number is missing in the progression?";
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;

    public static void startProgressionGame() {
        String[][] progData = new String[Engine.NUMBER_OF_ROUNDS_IN_GAME][Engine.NUMBER_OF_ELEMENTS_FOR_GAME_ARRAY];

        for (String[] round : progData) {
            int step = Utils.getRandomNumber(MIN_STEP, MAX_STEP);
            int length = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
            int hiddenIndex = Utils.getRandomNumber(0, length - 1);

            String[] progression = getProgression(step, length);
            String hiddenProgression = getProgressionWithHiddenNum(progression, hiddenIndex);

            round[Engine.QUESTION_INDEX_IN_ARRAY] = hiddenProgression;
            round[Engine.CORRECT_ANSWER_INDEX_IN_ARRAY] = progression[hiddenIndex];
        }

        Engine.runGameProcess(RULES, progData);
    }

    private static String[] getProgression(int step, int length) {
        int start = Utils.getRandomNumber(1, 50);
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(start + i * step);
        }
        return progression;
    }

    private static String getProgressionWithHiddenNum(String[] progression, int hiddenIndex) {
        String[] progressionCopy = progression.clone();
        progressionCopy[hiddenIndex] = "..";
        return String.join(" ", progressionCopy);
    }
}
