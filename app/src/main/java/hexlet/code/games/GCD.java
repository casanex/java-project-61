package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utilits;

public class GCD {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 0;

    public static void startGame() {
        var task = "Find the greatest common divisor of given numbers.";
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRoundData();
        }
        Engine.start(task, questions);
    }

    public static int getGCD(int firstNumber, int secondNumber) {
        int dividend = Math.max(firstNumber, secondNumber);
        int divider  = Math.min(firstNumber, secondNumber);

        while (divider != 0) {
            var temp = dividend % divider;

            dividend = divider;
            divider = temp;
        }
        return dividend;
    }

    public static String[] generateRoundData() {
        var firstNumber = Utilits.getRandom(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        var secondNumber = Utilits.getRandom(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        var question = firstNumber + " " + secondNumber;
        var gcd = getGCD(firstNumber, secondNumber);
        var correctAnswer = Integer.toString(gcd);
        return new String[] {question, correctAnswer};
    }
}
