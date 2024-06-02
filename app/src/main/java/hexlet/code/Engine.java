package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_ROUNDS = 3;

    public static int score = 0;

    public static boolean startRound(String question, String correctAnswer) {
        askQuestion(question);
        String answer = getAnswer();
        if (correctAnswer.equals(answer)) {
            System.out.println("Correct!");
            Engine.score++;
            if (Engine.score == Engine.COUNT_ROUNDS) {
                System.out.println("You win! Congratulations, " + Cli.playerName + "!");
            }
            return true;
        }
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + Cli.playerName + "!");
        return false;
    }

    private static void askQuestion(String question) {
        System.out.println("Question: " + question);
    }

    private static String getAnswer() {
        System.out.print("Your answer: ");
        return new Scanner(System.in).next();
    }
}
