package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May i have your name? ");
        return scanner.next();
    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
