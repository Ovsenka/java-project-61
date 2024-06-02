package hexlet.code;

import hexlet.code.games.PrimeGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.EvenGame;


import java.util.Scanner;

public class App {

    private static final int SELECT_GREETING = 1;
    private static final int SELECT_EVEN = 2;
    private static final int SELECT_CALC = 3;
    private static final int SELECT_GCD = 4;
    private static final int SELECT_PROGRESSION = 5;
    private static final int SELECT_PRIME = 6;

    private static final String MENU = """
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            5 - Progression
            6 - Prime
            0 - Exit""";
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(MENU);
        System.out.print("Your choice: ");
        int selected = new Scanner(System.in).nextInt();
        switch (selected) {
            case SELECT_GREETING:
                Cli.greeting();
                break;
            case SELECT_EVEN:
                Cli.greeting();
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                EvenGame.runGame();
                break;
            case SELECT_CALC:
                Cli.greeting();
                System.out.println("What is the result of the expression?");
                CalcGame.runGame();
                break;
            case SELECT_GCD:
                Cli.greeting();
                System.out.println("Find the greatest common divisor of given numbers.");
                GcdGame.runGame();
                break;
            case SELECT_PROGRESSION:
                Cli.greeting();
                System.out.println("What number is missing in the progression?");
                ProgressionGame.runGame();
                break;
            case SELECT_PRIME:
                Cli.greeting();
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                PrimeGame.runGame();
                break;
            default:
                break;
        }


    }
}
