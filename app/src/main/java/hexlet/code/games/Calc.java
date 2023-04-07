package hexlet.code.games;

import hexlet.code.Utilits;
import hexlet.code.Engine;


public class Calc {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 0;
    private static final String[][] QUESTION_AND_ANSWER = new String[Engine.ROUNDS_COUNT][2];

    public static void startGame() {
        var task = "What is the result of the expression?";

        generateRoundData();
        Engine.start(task, QUESTION_AND_ANSWER);
    }

    public static char getRandomOperator() {
        final int max = 2;
        final int min = 0;
        var randomNumber = (int) (Math.random() * ((max - min) + 1) + min);

        return switch (randomNumber) {
            case 0 -> '*';
            case 1 -> '+';
            case 2 -> '-';
            default -> throw new Error("Incorrect operator");
        };
    }

    public static int calculate(char operator, int firstNumber, int secondNumber) {
        return switch (operator) {
            case '*' -> firstNumber * secondNumber;
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            default -> throw new Error("Incorrect operator");
        };
    }

    public static void generateRoundData() {
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var firstNumber = Utilits.getRandom(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var secondNumber = Utilits.getRandom(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var operator = getRandomOperator();
            var question = firstNumber + " " + operator + " " + secondNumber;
            var correctAnswer = Integer.toString(calculate(operator, firstNumber, secondNumber));

            QUESTION_AND_ANSWER[i] = new String[] {question, correctAnswer};
        }
    }
}
