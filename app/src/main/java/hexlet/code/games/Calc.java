package hexlet.code.games;

import hexlet.code.Utilits;
import hexlet.code.Engine;
import java.util.Scanner;

public class Calc {
public static int calcResult (int num1, int num2, String operation) {
    return switch (operation) {
        case "+"-> num1 + num2;
        case "-"-> num1 - num2;
        default -> num1 * num2;
    };
}
    public static void calc () {
        String condition = "What is result of the expression?";
        String[][] questionAnswers = new String[Engine.answer_size][Engine.question_size];

        for (int i = 0; i < Engine.question_size; i++) {
            int number1 = Utilits.getRandom();
            int number2 = Utilits.getRandom();
            String operation = Utilits.getRandomOperation();

            questionAnswers[Engine.place_for_question][i] = number1 + " " + operation + " " + number2;
            questionAnswers[Engine.place_for_answer][i] =Integer.toString(calcResult(number1, number2, operation));

        }
        Engine.doLogic(questionAnswers, condition);
    }
}
