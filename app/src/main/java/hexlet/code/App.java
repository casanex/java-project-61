package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter \n1 - Greet \n2 - Even \n3 - Calc \n4 - GCD \n0 - exit ");
        String choise = scanner.next();
        System.out.println("Your choise: " + choise);

        switch(choise) {
            case "2":
                Even.even();
                break;
            case "3":
                Calc.calc();
                break;
            case "4":
                GCD.gcd();
                break;
        }


    }
}
