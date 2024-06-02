package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class ProgressionGame {
    private static final Random RANDOM = new Random();
    private static final int BOUND_PROGRESSION = 10;
    private static final int MIN_LEN_PROGRESSION = 5;
    private static final int MAX_INIT_VALUE = 25;
    private static final int MAX_D_VALUE = 15;
    public static void runGame() {
        Engine.setScore(0);
        while (Engine.getScore() != Engine.COUNT_ROUNDS) {
            StringBuilder progression = new StringBuilder();
            int d = RANDOM.nextInt(MAX_D_VALUE) + 1;
            int value = RANDOM.nextInt(MAX_INIT_VALUE) + 1;
            int lengthProgression = RANDOM.nextInt(BOUND_PROGRESSION) + MIN_LEN_PROGRESSION;
            int position = RANDOM.nextInt(lengthProgression);
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
            if (!Engine.startRound(progression.toString(), correctAnswer)) {
                break;
            }
        }
    }
}
