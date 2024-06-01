package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String playerName = "";
    private static void askPlayerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May i have your name? ");
        playerName = scanner.next();
    }

    public static void greeting() {
        System.out.println("\nWelcome to the Brain Games!");
        Cli.askPlayerName();
        System.out.println("Hello, " + playerName + "!");
    }
}
