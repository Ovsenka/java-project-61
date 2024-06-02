package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {

    private static final String MENU = """
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            5 - Progression
            0 - Exit""";
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(MENU);
        System.out.print("Your choice: ");
        int selected = new Scanner(System.in).nextInt();
        switch (selected) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                Cli.greeting();
                EvenGame.runGame();
                break;
            case 3:
                Cli.greeting();
                CalcGame.runGame();
                break;
            case 4:
                Cli.greeting();
                GcdGame.runGame();
                break;
            case 5:
                Cli.greeting();
                ProgressionGame.runGame();
                break;
            default:
                break;
        }


    }
}
