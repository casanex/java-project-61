package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utilits;

public class Prime {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 0;
    public static void startGame() {
        var task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRoundData();
        }
        Engine.start(task, questions);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else if (number == 2) {
            return true;
        }
        for (var divider = number - 1; divider > 1; divider--) {
            if (number % divider == 0) {
                return false;
            }
        }
        return true;

    }
    public static String[] generateRoundData() {
        var number = Utilits.getRandom(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        var question = Integer.toString(number);
        var correctAnswer = isPrime(number) ? "yes" : "no";
        return new String[] {question, correctAnswer};
    }
}
