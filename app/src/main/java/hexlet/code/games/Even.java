package hexlet.code.games;
import hexlet.code.Utilits;
import hexlet.code.Engine;
public class Even {
        public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void even() {
        String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionAnswers = new String[Engine.answer_size][Engine.question_size];
        for (int i = 0; i < Engine.question_size; i++) {
            int random_number = Utilits.getRandom();
            questionAnswers[Engine.place_for_question][i] = Integer.toString(random_number);
            questionAnswers[Engine.place_for_answer][i] = (isEven(random_number)) ? "yes" : "no";
            }
        Engine.doLogic(questionAnswers, condition);
    }
}