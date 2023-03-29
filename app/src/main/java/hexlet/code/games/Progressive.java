package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utilits;

public class Progressive {
    static final int PROGRESSION_LENGTH = 10;
    public static void getArrayProgressive() {
        String condition = "What number is missing in the progression?";
        String[][] questionAnswers = arrayGame();
        Engine.doLogic(questionAnswers, condition);

    }
    public static String[][] arrayGame() {
        String[][] questionAnswers = new String[Engine.ANSWER_SIZE][Engine.QUESTION_SIZE];
        for (int i = 0; i < Engine.QUESTION_SIZE; i++) {
            int firstNumber = Utilits.getRandom();
            int step = (int) (Math.random() * PROGRESSION_LENGTH);

            String[] massive = getMassive(firstNumber, step, PROGRESSION_LENGTH);
            int d = (int) (Math.random() * PROGRESSION_LENGTH);
            String element  = massive[d];
            massive[d] = "..";

            questionAnswers[Engine.PLACE_FOR_QUESTION][i] = String.join(" ", massive);
            questionAnswers[Engine.PLACE_FOR_ANSWER][i] = element;
        }
        return questionAnswers;

    }
    public static String[] getMassive(int firstNumber, int step, int length) {
        String[] massive = new String[length];
        massive[0] = Integer.toString(firstNumber);

        for (int i = 1; i < length; i++) {
            massive[i] = Integer.toString(Integer.parseInt(massive[i - 1]) + step);
        }
        return massive;
    }
}
