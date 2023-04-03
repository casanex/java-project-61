package hexlet.code.games;

import hexlet.code.Utilits;
import hexlet.code.Engine;

public class Even {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void startGame() {
        String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionAnswers = new String[Engine.ANSWER_SIZE][Engine.QUESTION_SIZE];
        for (int i = 0; i < Engine.QUESTION_SIZE; i++) {
            int randomNumber = Utilits.getRandom();
            questionAnswers[Engine.PLACE_FOR_QUESTION][i] = Integer.toString(randomNumber);
            questionAnswers[Engine.PLACE_FOR_ANSWER][i] = (isEven(randomNumber)) ? "yes" : "no";
        }
        Engine.doLogic(questionAnswers, condition);
    }
}
