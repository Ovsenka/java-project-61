package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class CalcGame {

    private static final String[] OPERATORS = {" + ", " - ", " * "};
    private static final Random RANDOM = new Random();
    public static void runGame() {
        Engine.score = 0;
        while (Engine.score != Engine.COUNT_ROUNDS) {
            int num1 = RANDOM.nextInt(100);
            int num2 = RANDOM.nextInt(100);
            int operator = RANDOM.nextInt(3);
            int correctAnswer = -1;
            String question = num1 + OPERATORS[operator] + num2;
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
                default:
                    break;
            }
            if (!Engine.startRound(question, String.valueOf(correctAnswer))) {
                break;
            }
        }
    }
}
