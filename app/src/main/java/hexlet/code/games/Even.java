package hexlet.code.games;


import hexlet.code.Greet;

import java.util.Scanner;

public class Even {
    static final int question_size = 3;
    static final int answer_size = 2;
    static final int place_for_question = 0;
    static final int place_for_answer = 1;

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }


    public static void even() {
        Scanner scanner = new Scanner(System.in);
        Greet.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int a = 0;
        int b = 100;
        int roundCount = 0;
        String[][] questionAnswers = new String[answer_size][question_size];
        for (int i = 0; i < question_size; i++) {
            int random_number = a + (int) (Math.random() * b);
            System.out.println("Question: " + random_number);
            System.out.println("Your answer:");
            String answer = scanner.next();
            questionAnswers[place_for_question][i] = Integer.toString(random_number);
            questionAnswers[place_for_answer][i] = (isEven(random_number)) ? "yes" : "no";
             if (answer.equals(questionAnswers[place_for_answer][i])) {
                 System.out.println("Correct!");
                 roundCount++;
             } else {
                 System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + questionAnswers[place_for_answer][i] + "'");
                 System.out.println("Let's try again, ");
                 break;
             }

        }
            if (roundCount == question_size) {
                System.out.println("Congratulations!");
        }
    }
}