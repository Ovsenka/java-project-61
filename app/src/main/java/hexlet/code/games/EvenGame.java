package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public static void runGame() {
        Engine.score = 0;
        String playerName = Cli.playerName;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (Engine.score != Engine.countRounds) {
            Random random = new Random();
            int number = random.nextInt(10000) ;
            String correctAnswer = "";
            if (number % 2 == 0) {
                correctAnswer = "yes";
            }
            else {
                correctAnswer = "no";
            }
            if (Engine.startRound(String.valueOf(number), correctAnswer)) {
                Engine.score++;
            }
            else {
                System.out.println("Let's try again, " + playerName + "!");
                break;
            }
        }
        if (Engine.score == Engine.countRounds) {
            System.out.println("You win! Congratulations, " + playerName + "!");
        }
    }
}
