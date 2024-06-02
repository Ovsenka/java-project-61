package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class EvenGame {
    private static final Random RANDOM = new Random();
    public static void runGame() {
        Engine.score = 0;
        while (Engine.score != Engine.COUNT_ROUNDS) {
            int number = RANDOM.nextInt(10000);
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
