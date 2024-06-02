package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class ProgressionGame {
    public static void runGame() {
        Engine.score = 0;
        String playerName = Cli.playerName;
        System.out.println("What number is missing in the progression?");
        while (Engine.score != Engine.COUNT_ROUNDS) {
            StringBuilder progression = new StringBuilder();
            Random random = new Random();
            int d = random.nextInt(10) + 1;
            int value = random.nextInt(25) + 1;
            int lengthProgression = random.nextInt(8) + 5;
            int position = random.nextInt(lengthProgression);
            String correctAnswer = "";
            for (int i = 0; i < lengthProgression; i++) {
                if (i == position) {
                    progression.append(".. ");
                    correctAnswer = String.valueOf(value);
                } else {
                    progression.append(value).append(" ");
                }
                value += d;
            }
            if (Engine.startRound(progression.toString(), correctAnswer)) {
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
