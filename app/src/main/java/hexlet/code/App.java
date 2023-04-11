package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.Progressive;

import java.util.Scanner;

public class App {
    private static final String CHOICE_FOR_GREET = "1";
    private static final String CHOICE_FOR_EVEN = "2";
    private static final String CHOICE_FOR_CALC = "3";
    private static final String CHOICE_FOR_GCD = "4";
    private static final String CHOICE_FOR_PROG = "5";
    private static final String CHOICE_FOR_PRIME = "6";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(" 1 - Greet");
        System.out.println(" 2 - Even");
        System.out.println(" 3 - Calc");
        System.out.println(" 4 - GCD");
        System.out.println(" 5 - Progression");
        System.out.println(" 6 - Prime");
        System.out.println(" 0 - exit");
        String choise = scanner.next();
        System.out.println(" Your choise: " + choise);

        switch (choise) {
            case CHOICE_FOR_GREET -> Greet.greet();
            case CHOICE_FOR_EVEN -> Even.startGame();
            case CHOICE_FOR_CALC -> Calc.startGame();
            case CHOICE_FOR_GCD -> GCD.startGame();
            case CHOICE_FOR_PROG -> Progressive.startGame();
            case CHOICE_FOR_PRIME -> Prime.startGame();
            default -> System.out.println("No game " + choise + " found. Please try again");
        }
    }
}
