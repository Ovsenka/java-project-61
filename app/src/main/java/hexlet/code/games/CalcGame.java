package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class CalcGame {

    private static final String[] OPERATORS = {" + ", " - ", " * "};
    private static final Random RANDOM = new Random();

    private static final int MAX_NUMBER = 100;

    private static final int MAX_COUNT_OPERATORS = 3;
    public static void runGame() {
        Engine.setScore(0);
        while (Engine.getScore() != Engine.COUNT_ROUNDS) {
            int num1 = RANDOM.nextInt(MAX_NUMBER);
            int num2 = RANDOM.nextInt(MAX_NUMBER);
            int operator = RANDOM.nextInt(MAX_COUNT_OPERATORS);
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
