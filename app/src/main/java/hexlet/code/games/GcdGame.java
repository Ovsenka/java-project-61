package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class GcdGame {
    public static void runGame() {
        Engine.score = 0;
        String playerName = Cli.playerName;
        System.out.println("Find the greatest common divisor of given numbers.");
        Random random = new Random();
        while (Engine.score != Engine.COUNT_ROUNDS) {
            int num1 = random.nextInt(200);
            int num2 = random.nextInt(200);
            int correctAnswer;
            String question = num1 + " " + num2;
            correctAnswer = Utils.getGcd(num1, num2);
            if (Engine.startRound(question, String.valueOf(correctAnswer))) {
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
