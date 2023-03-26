package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utilits;

public class GCD {

    public static int gcdResult(int num1, int num2) {
        while (num2 != 0) {
            int tmp = num1 % num2;
            num1 = num2;
            num2 = tmp;
        }
        return num1;
    }

    public static void gcd() {
        String condition = "Find the greatest common divisor of given numbers.";
        String[][] questionAnswers = new String[Engine.answer_size][Engine.question_size];
        for (int i = 0; i < Engine.question_size; i++) {
            int number1 = Utilits.getRandom();
            int number2 = Utilits.getRandom();

            questionAnswers[Engine.place_for_question][i] = number1 + " " + number2;
            questionAnswers[Engine.place_for_answer][i] = Integer.toString(gcdResult(number1, number2));
        }
        Engine.doLogic(questionAnswers, condition);
    }
}
