package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter \n1 - Greet \n2 - Even \n3 - Calc \n4 - GCD \n5 - Progression \n6 - Prime \n0 - exit");
        String choise = scanner.next();
        System.out.println("Your choise: " + choise);
        Cli.greet();


    }
}
