package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;

public class GcdGame {
    private static final Random RANDOM = new Random();

    private static final int MAX_RAND_NUMBER = 200;
    public static void runGame() {
        Engine.setScore(0);
        while (Engine.getScore() != Engine.COUNT_ROUNDS) {
            int num1 = RANDOM.nextInt(MAX_RAND_NUMBER);
            int num2 = RANDOM.nextInt(MAX_RAND_NUMBER);
            int correctAnswer;
            String question = num1 + " " + num2;
            correctAnswer = Utils.getGcd(num1, num2);
            if (!Engine.startRound(question, String.valueOf(correctAnswer))) {
                break;
            }
        }
    }
}
