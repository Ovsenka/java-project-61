package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class PrimeGame {
    public static void runGame() {
        Engine.score = 0;
        String playerName = Cli.playerName;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (Engine.score != Engine.COUNT_ROUNDS) {
            String correctAnswer;
            Random random = new Random();
            int number = random.nextInt(100) + 1;
            if (Utils.isPrime(number)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            if (Engine.startRound(String.valueOf(number), correctAnswer)) {
                Engine.score++;
            } else {
                System.out.println("Let's try again, " + playerName + "!");
                break;
            }

        }
        if (Engine.score == Engine.COUNT_ROUNDS) {
            System.out.println("You win! Congratulations, " + playerName + "!");
        }
    }
}
