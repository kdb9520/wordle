package src;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessCheck {
    private Scanner in = new Scanner(System.in);
    private int score;

    public GuessCheck() {
        this.score = 0;
    }

    public Guess getGuess() {
        ArrayList<String> guess = new ArrayList<>();
        boolean notValid = true;
        while (notValid) {
            String guessStr = in.nextLine();
            if (guessStr.equals("quit")) {
                System.out.println("Quitting the game.");
                System.exit(0);
            } else if (guessStr.length() != 5) {
                System.out.println("Guess must be 5 letters!");
            } else {
                for (int i = 0; i < guessStr.length(); i++) {
                    guess.add(String.valueOf(guessStr.charAt(i)));
                }
                notValid = false;
            }
        }
        return new Guess(guess);
    }

    public void setScore(int amount) {
        this.score += amount;
    }

    public int getScore() {
        return this.score;
    }
}
