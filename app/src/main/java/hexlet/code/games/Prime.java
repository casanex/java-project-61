package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utilits;

public class Prime {

    public static boolean isNatural (int number) {
        if (number < 2) return false;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void prime() {
        String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAnswers = new String[Engine.answer_size][Engine.question_size];
        for (int i = 0; i < Engine.question_size; i++) {
            int random_number = Utilits.getRandom();
            questionAnswers[Engine.place_for_question][i] = Integer.toString(random_number);
            questionAnswers[Engine.place_for_answer][i] = (isNatural(random_number)) ? "yes" : "no";
        }
        Engine.doLogic(questionAnswers, condition);
    }
}
