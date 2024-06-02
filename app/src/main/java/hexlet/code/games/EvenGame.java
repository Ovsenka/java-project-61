package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class EvenGame {
    private static final Random RANDOM = new Random();

    private static final int MAX_NUMBER = 10000;
    public static void runGame() {
        Engine.setScore(0);
        while (Engine.getScore() != Engine.COUNT_ROUNDS) {
            int number = RANDOM.nextInt(MAX_NUMBER);
            String correctAnswer;
            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            if (!Engine.startRound(String.valueOf(number), correctAnswer)) {
                break;
            }
        }
    }
}
