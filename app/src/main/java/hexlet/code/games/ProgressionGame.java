package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class ProgressionGame {
    private static final StringBuilder PROGRESSION = new StringBuilder();
    private static final Random RANDOM = new Random();
    public static void runGame() {
        Engine.score = 0;
        while (Engine.score != Engine.COUNT_ROUNDS) {
            int d = RANDOM.nextInt(10) + 1;
            int value = RANDOM.nextInt(25) + 1;
            int lengthProgression = RANDOM.nextInt(8) + 5;
            int position = RANDOM.nextInt(lengthProgression);
            String correctAnswer = "";
            for (int i = 0; i < lengthProgression; i++) {
                if (i == position) {
                    PROGRESSION.append(".. ");
                    correctAnswer = String.valueOf(value);
                } else {
                    PROGRESSION.append(value).append(" ");
                }
                value += d;
            }
            if (!Engine.startRound(PROGRESSION.toString(), correctAnswer)) {
                break;
            }
        }
    }
}
