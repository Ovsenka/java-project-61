package hexlet.code;

import java.util.Scanner;

public class App {

    private final static String menu = "1 - Greet\n" +
            "2 - Even\n" +
            "0 - Exit";
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(menu);
        System.out.print("Your choice: ");
        int selected = new Scanner(System.in).nextInt();
        switch (selected) {
            case 1:
                Cli.greeting();
            case 2:
                Cli.greeting();
                EvenGame.runGame();
                break;
        }


    }
}
