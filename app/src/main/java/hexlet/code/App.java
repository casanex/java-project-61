package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.Progressive;

import java.util.Scanner;

public class App {
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
            case "1" -> Greet.greet();
            case "2" -> Even.even();
            case "3" -> Calc.calc();
            case "4" -> GCD.gcd();
            case "5" -> Progressive.getArrayProgressive();
            case "6" -> Prime.prime();
            default -> scanner.close();
        }
    }
}
