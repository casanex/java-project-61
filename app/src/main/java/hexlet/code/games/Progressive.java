package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utilits;

public class Progressive {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 0;
    public static final int PROGRESSION_LENGTH = 10;
    public static final int STEP_MAX = 10;
    public static final int STEP_MIN = 1;

    public static void startGame() {
        var task = "What number is missing in the progression?";
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRoundData();
        }
        Engine.start(task, questions);
    }

    public static String[] getProgression(int number, int step, int progressionLength) {
        String[] progression = new String[progressionLength];

        for (var i = 0; i < progressionLength; i++) {
            progression[i] = Integer.toString(number);
            number += step;
        }
        return progression;
    }

    public static String[] generateRoundData() {
        var firstNumber = Utilits.getRandom(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        var step = Utilits.getRandom(STEP_MIN, STEP_MAX);
        String[] progression = getProgression(firstNumber, step, PROGRESSION_LENGTH);
        var hiddenNumberIndex = Utilits.getRandom(0, PROGRESSION_LENGTH - 1);
        var correctAnswer = progression[hiddenNumberIndex];
        progression[hiddenNumberIndex] = "..";
        var question = String.join(" ", progression);
        return new String[] {question, correctAnswer};
    }
}
