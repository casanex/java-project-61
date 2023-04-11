package hexlet.code.games;

import hexlet.code.Utilits;
import hexlet.code.Engine;


public class Calc {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 0;


    public static void startGame() {
        var task = "What is the result of the expression?";
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRoundData();
        }
        Engine.start(task, questions);
    }

    public static char getRandomOperator() {
        final int max = 2;
        final int min = 0;
        var randomNumber = Utilits.getRandom(min, max);

        return switch (randomNumber) {
            case 0 -> '*';
            case 1 -> '+';
            case 2 -> '-';
            default -> throw new RuntimeException("Incorrect operator");
        };
    }

    public static int calculate(char operator, int firstNumber, int secondNumber) {
        return switch (operator) {
            case '*' -> firstNumber * secondNumber;
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            default -> throw new RuntimeException("Incorrect operator");
        };
    }

    public static String[] generateRoundData() {

        var firstNumber = Utilits.getRandom(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        var secondNumber = Utilits.getRandom(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        var operator = getRandomOperator();
        var question = firstNumber + " " + operator + " " + secondNumber;
        var correctAnswer = Integer.toString(calculate(operator, firstNumber, secondNumber));

        return new String[] {question, correctAnswer};
    }
}
