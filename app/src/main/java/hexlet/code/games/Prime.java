package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utilits;

public class Prime {

    public static boolean isNatural(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void startGame() {
        String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAnswers = new String[Engine.ANSWER_SIZE][Engine.QUESTION_SIZE];
        for (int i = 0; i < Engine.QUESTION_SIZE; i++) {
            int randomNumber = Utilits.getRandom();
            questionAnswers[Engine.PLACE_FOR_QUESTION][i] = Integer.toString(randomNumber);
            questionAnswers[Engine.PLACE_FOR_ANSWER][i] = (isNatural(randomNumber)) ? "yes" : "no";
        }
        Engine.doLogic(questionAnswers, condition);
    }
}
