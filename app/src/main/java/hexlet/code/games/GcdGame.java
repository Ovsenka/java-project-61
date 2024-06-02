package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;

public class GcdGame {
    private static final Random RANDOM = new Random();
    public static void runGame() {
        Engine.score = 0;
        while (Engine.score != Engine.COUNT_ROUNDS) {
            int num1 = RANDOM.nextInt(200);
            int num2 = RANDOM.nextInt(200);
            int correctAnswer;
            String question = num1 + " " + num2;
            correctAnswer = Utils.getGcd(num1, num2);
            if (!Engine.startRound(question, String.valueOf(correctAnswer))) {
                break;
            }
        }
    }
}
