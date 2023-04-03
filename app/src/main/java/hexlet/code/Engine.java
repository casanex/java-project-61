package hexlet.code;
import java.util.Scanner;
public class Engine {
    public static final int QUESTION_SIZE = 3;
    public static final int ANSWER_SIZE = 2;
    public static final int PLACE_FOR_QUESTION = 0;
    public static final int PLACE_FOR_ANSWER = 1;

    public static void doLogic(String[][] questionsAnswers, String condition) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(condition);



        for (int i = 0; i < QUESTION_SIZE; i++) {
            System.out.println("Question: " + questionsAnswers[PLACE_FOR_QUESTION][i]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (!answer.equals(questionsAnswers[PLACE_FOR_ANSWER][i])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questionsAnswers[PLACE_FOR_ANSWER][i] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");

        }
        System.out.println("Congratulations, " + userName + "!");


        scanner.close();
    }
}
