package hexlet.code;
import java.util.Scanner;
public class Engine {
    public static final int question_size = 3;
    public static final int answer_size = 2;
    public static final int place_for_question = 0;
    public static final int place_for_answer = 1;

    public static void doLogic(String[][] questionsAnswers, String condition) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(condition);

        int roundsCount = 0;

        for (int i = 0; i < question_size; i++) {
            System.out.println("Question: " + questionsAnswers[place_for_question][i]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(questionsAnswers[place_for_answer][i])) {
                System.out.println("Correct!");
                roundsCount++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questionsAnswers[place_for_answer][i] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        if (roundsCount == question_size) {
            System.out.println("Congratulations, " + userName + "!");
        }

        scanner.close();
    }
}
