package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class App {

    private final static String menu = "1 - Greet\n" +
            "2 - Even\n" +
            "3 - Calc\n" +
            "0 - Exit";
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(menu);
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
        }


    }
}
