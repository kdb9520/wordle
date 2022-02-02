package src;

import java.util.ArrayList;

public class Guess {
    private static int currentGuessNumber = 1;
    private int guessNumber;
    private ArrayList<String> guess;
    private int correctPositions;
    private int wrongPositions;

    public Guess(ArrayList<String> guess) {
        this.guess = guess;
        this.guessNumber = currentGuessNumber++;
        this.correctPositions = 0;
        this.wrongPositions = 0;
    }

    public int getCorrectPositions() {
        return this.correctPositions;
    }

    public void setCorrectPositions(int correctPositions) {
        this.correctPositions = correctPositions;
    }

    public int getWrongPositions() {
        return this.wrongPositions;
    }

    public void setWrongPositions(int wrongPositions) {
        this.wrongPositions = wrongPositions;
    }

    public ArrayList<String> getGuess() {
        return this.guess;
    }

    @Override
    public String toString() {
        return "Guess #" + this.guessNumber +
                ": " + this.guess +
                " (Green:" + this.correctPositions +
                " Yellow:" + this.wrongPositions +
                ")";
    }
}
