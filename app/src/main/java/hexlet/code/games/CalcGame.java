package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class CalcGame {

    private static final String operators[] = {" + ", " - ", " * "};
    public static void runGame() {
        Engine.score = 0;
        String playerName = Cli.playerName;
        System.out.println("What is the result of the expression?");
        Random random = new Random();
        while (Engine.score != Engine.countRounds) {
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            int operator = random.nextInt(3);
            int correctAnswer = -1;
            String question = String.valueOf(num1) + operators[operator] + String.valueOf(num2);
            switch (operator) {
                case 0:
                    correctAnswer = num1 + num2;
                    break;
                case 1:
                    correctAnswer = num1 - num2;
                    break;
                case 2:
                    correctAnswer = num1 * num2;
                    break;
            }
            if (Engine.startRound(question, String.valueOf(correctAnswer))) {
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
