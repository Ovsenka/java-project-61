package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    private static int gameScore = 0;
    public static void runGame() {
        String playerName = Cli.playerName;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (gameScore != 3) {
            Random random = new Random();
            int number = random.nextInt(10000) ;
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = new Scanner(System.in).next();
            if (answer.equals("yes") && number % 2 != 0) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, Bill!");
                break;
            } else if (answer.equals("no") && number % 2 == 0) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
                        "Let's try again, " + playerName);
                break;
            } else if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println(answer + " is wrong answer ;(.\n" +
                        "Let's try again, " + playerName);
                break;
            } else {
                System.out.println("Correct!");
                gameScore++;
            }
        }
        if (gameScore == 3) {
            System.out.println("You win! Congratulations, " + playerName);
        }
    }
}
