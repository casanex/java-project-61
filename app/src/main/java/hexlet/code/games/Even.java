package hexlet.code.games;
import hexlet.code.Utilits;
import hexlet.code.Engine;

public class Even {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 0;

    public static void startGame() {
        var task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRoundData();
        }
        Engine.start(task, questions);
    }

    public static boolean isEven(int userAnswer) {
        return userAnswer % 2 == 0;
    }
    public static String[] generateRoundData() {
        var number = Utilits.getRandom(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        var question = Integer.toString(number);
        var correctAnswer = isEven(number) ? "yes" : "no";
        return new String[] {question, correctAnswer};
    }
}
