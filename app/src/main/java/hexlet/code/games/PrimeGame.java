package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class PrimeGame {
    private static final Random RANDOM = new Random();

    private static final int MAX_RANDOM_NUMBER = 100;

    public static void runGame() {
        Engine.setScore(0);
        while (Engine.getScore() != Engine.COUNT_ROUNDS) {
            int number = RANDOM.nextInt(MAX_RANDOM_NUMBER) + 1;
            String correctAnswer;
            if (Utils.isPrime(number)) {
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
