package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_ROUNDS = 3;

    private static int score = 0;

    public static boolean startRound(String question, String correctAnswer) {
        askQuestion(question);
        String answer = getAnswer();
        if (correctAnswer.equals(answer)) {
            System.out.println("Correct!");
            Engine.score++;
            if (Engine.score == Engine.COUNT_ROUNDS) {
                System.out.println("You win! Congratulations, " + Cli.getPlayerName() + "!");
            }
            return true;
        }
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + Cli.getPlayerName() + "!");
        return false;
    }

    private static void askQuestion(String question) {
        System.out.println("Question: " + question);
    }

    private static String getAnswer() {
        System.out.print("Your answer: ");
        return new Scanner(System.in).next();
    }

    public static int getScore() {
        return score;
    }

    public static void setScore(final int  newScore) {
        Engine.score = newScore;
    }
}
