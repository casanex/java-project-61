package hexlet.code.games;


import hexlet.code.Greet;
import hexlet.code.Utilits;
import hexlet.code.Engine;
import java.util.Scanner;

public class Even {
        public static boolean isEven(int number) {

        return number % 2 == 0;
    }


    public static void even() {
        Scanner scanner = new Scanner(System.in);
        Greet.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int roundCount = 0;
        String[][] questionAnswers = new String[Engine.answer_size][Engine.question_size];
        for (int i = 0; i < Engine.question_size; i++) {
            int random_number = Utilits.getRandom();
            System.out.println("Question: " + random_number);
            System.out.println("Your answer:");
            String answer = scanner.next();
            questionAnswers[Engine.place_for_question][i] = Integer.toString(random_number);
            questionAnswers[Engine.place_for_answer][i] = (isEven(random_number)) ? "yes" : "no";
             if (answer.equals(questionAnswers[Engine.place_for_answer][i])) {
                 System.out.println("Correct!");
                 roundCount++;
             } else {
                 System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + questionAnswers[Engine.place_for_answer][i] + "'");
                 System.out.println("Let's try again, ");
                 break;
             }

        }
            if (roundCount == Engine.question_size) {
                System.out.println("Congratulations!");
        }
    }
}