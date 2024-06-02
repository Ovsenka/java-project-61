package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class PrimeGame {
    private static final Random RANDOM = new Random();

    public static void runGame() {
        Engine.score = 0;
        while (Engine.score != Engine.COUNT_ROUNDS) {
            int number = RANDOM.nextInt(100) + 1;
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
